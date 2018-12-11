package com.github.dchristofolli.Study_List_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class List_Stream {
    public static void main(String[] args) {
        List<String> lista= Arrays.asList("Grêmio", "Chapecoense", "Goiás");
        String resultado = lista.stream().map()
        System.out.println(resultado);
    }
}
