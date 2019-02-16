package com.github.dchristofolli.ListStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ListStream {
    static List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Daniel", 35),
            new Pessoa("Daiane", 35),
            new Pessoa("Marcelo", 32));
    static Stream<Pessoa> pessoaStream = listaPessoas.stream();

    public static void main(String[] args) {
//        Optional<Pessoa> pessoaEmpty = Optional.empty();
//        System.out.println(pessoaEmpty);
//        Optional<Integer> pessoaOf = Optional.of(pessoaStream.mapToInt(p-> p.getIdade()).min().getAsInt());
//        System.out.println(pessoaOf);
//        Optional<Integer> pessoaOfNullable = Optional.ofNullable(pessoaStream.mapToInt(p-> p.getIdade()).min().getAsInt());
//        System.out.println(pessoaOfNullable);

    }

    private static Integer menorIdade() {
        return pessoaStream.mapToInt(p-> p.getIdade()).min().getAsInt();
    }


    private static Integer maiorIdade() {
        return pessoaStream.mapToInt(p-> p.getIdade()).max().getAsInt();
    }

    private static Integer somaIdade() {
        return pessoaStream.filter(p-> p.getNome().startsWith("D")).mapToInt(p-> p.getIdade()).sum();
    }

    private static long contaPessoas() {
        return pessoaStream.count();
    }
}