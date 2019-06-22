package com.github.dchristofolli.store.repositories;

import com.github.dchristofolli.store.controllers.ProductInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void createProduct(ProductInput productInput) {
        String sql = "insert into products (description, value) values (:description, :value)";

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("description", productInput.getDescription());
        parameters.addValue("value", productInput.getValue());

        namedParameterJdbcTemplate.update(sql, parameters);
    }
}
