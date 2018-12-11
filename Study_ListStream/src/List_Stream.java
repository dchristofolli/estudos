import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Stream {
    public static void main(String[] args) {
        List<Pessoa> pessoa = Arrays.asList(new Pessoa("Daniel", 35),
                (new Pessoa("Daiane", 34)),
                (new Pessoa("Karina", 28)),
                (new Pessoa("Marcelo", 30)));
        Stream<Pessoa> streamPessoa = pessoa.parallelStream();
//        IntSummaryStatistics estatistica = streamPessoa.filter(p -> p.getNome().
//                startsWith("D")).mapToInt(p -> p.getIdade()).summaryStatistics();
//        System.out.println(estatistica);
//        System.out.println("Menor idade:" + estatistica.getMin());
//        System.out.println("Maior idade: " + estatistica.getMax());
//        System.out.println("Média das idades: " + estatistica.getAverage());
//        System.out.println("Soma das idades: " + estatistica.getSum());
//        System.out.println("Quantidade de valores: " + estatistica.getCount());
//        String resultado = streamPessoa.map(n -> n.getIdade() * 2).toString();
//        System.out.println(resultado);
        //System.out.println(streamPessoa.filter(x -> x.getNome().equals("Daiane")).toString());
        System.out.println(streamPessoa.map(p -> p.getNome() + " da Silva").collect(Collectors.joining(" - ")));
    }
}