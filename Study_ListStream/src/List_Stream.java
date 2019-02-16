import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Stream {
    public static void main(String[] args) {
        List<Pessoa> pessoa = Arrays.asList(new Pessoa("Daniel", 35),
                (new Pessoa("Daiane", 34)),
                (new Pessoa("Karina", 28)),
                (new Pessoa("Marcelo", 30)));
        Stream<Pessoa> streamPessoa = pessoa.stream();
        streamPessoa.map(p -> p.getIdade()).reduce((x, y)-> x+y).ifPresent(p-> System.out.println(p));
        streamPessoa.reduce()


    }
}