package com.github.dchristofolli.store.repositories;

import com.github.dchristofolli.store.controllers.CustomerInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void createCustomer(CustomerInput customerInput){
        String sql = "insert into customers (name, cpf, telephone_number) values (:name, :cpf, :telephone_number)";

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("name", customerInput.getName());
        parameters.addValue("cpf", customerInput.getCpf());
        parameters.addValue("telephone_number", customerInput.getTelephone_number());

        namedParameterJdbcTemplate.update(sql, parameters);
    }
}
