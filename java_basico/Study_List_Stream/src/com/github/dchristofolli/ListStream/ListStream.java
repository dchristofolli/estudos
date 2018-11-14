package com.github.dchristofolli.ListStream;

import java.util.Arrays;
import java.util.List;

public class ListStream {
    public static void main(String[] args) {
        List<String> animal = Arrays.asList("cachorro", "gato", "cavalo");
        System.out.println(animal.stream().count());
    }
}
