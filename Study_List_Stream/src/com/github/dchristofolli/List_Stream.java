package com.github.dchristofolli;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Stream {
    public static void main(String[] args) {
        List<String> times = Arrays.asList("Grêmio", "Inter", "Coritiba", "Goiás");
        Stream<String> timesStream = times.parallelStream();
       // System.out.println(timesStream.count());
        System.out.println(timesStream.filter(p-> p.startsWith("G")).collect(Collectors.joining(" - ")));
    }
}
