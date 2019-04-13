import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<Pessoa> pessoa = Arrays.asList
                (new Pessoa("Daniel", 35),
                        (new Pessoa("Daiane", 34)),
                        (new Pessoa("Karina", 28)),
                        (new Pessoa("Marcelo", 30)));
        Stream<Pessoa> streamPessoa = pessoa.stream();

//        int result = streamPessoa.filter(p-> p.idade > 40).mapToInt(p-> p.idade).sum();
//        System.out.println(result);

        OptionalInt result = streamPessoa.filter(p -> p.idade > 40).mapToInt(p-> p.idade).reduce((a, b) -> a + b);
        if (result.isPresent()) {
            System.out.println(result.getAsInt());
        }
    }
}