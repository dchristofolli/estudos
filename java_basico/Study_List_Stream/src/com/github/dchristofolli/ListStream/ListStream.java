package com.github.dchristofolli.ListStream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ListStream {
    static List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Daniel", 35),
            new Pessoa("Daiane", 35),
            new Pessoa("Marcelo", 32));
    static Stream<Pessoa> pessoaStream = listaPessoas.stream();

    public static void main(String[] args) {

        //long contaPessoas = contaPessoas();
        //Integer somaIdade = somaIdade();
        //Integer maiorIdade = maiorIdade();
        //Integer menorIdade = menorIdade();

        IntSummaryStatistics intSummStat  = pessoaStream.filter(p -> p.getNome().startsWith("D"))
                .mapToInt(p -> p.getIdade()).collect(StringBuilder:: new,
                        (response, element)-> response.append(" ").append(element),
                        (response1, response2) -> response1.append;

        System.out.println(intSummStat.getSum());
        System.out.println(intSummStat.getMax());
        System.out.println(intSummStat.getMin());
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