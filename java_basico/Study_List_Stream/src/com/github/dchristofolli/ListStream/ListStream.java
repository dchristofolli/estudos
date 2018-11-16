package com.github.dchristofolli.ListStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {
    static List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Daniel", 35),
            new Pessoa("Daiane", 35),
            new Pessoa("Marcelo", 32));
    static Stream<Pessoa> pessoaStream = listaPessoas.stream();

    public static void main(String[] args) {
        long contaPessoas = contaPessoas();
        System.out.println(contaPessoas);


    }

    private static long contaPessoas() {
        return pessoaStream.count();
    }
}