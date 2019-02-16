import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class exercicios {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "PHP", "C#", "Clarion");
        Stream<String> listStream = list.stream();
        int soma = listStream.map(s -> s.length()) //soma dos tamanhos das Strings
                .mapToInt(Integer::new)
                .sum();
        System.out.println(soma);

        Stream<Integer> streamLength = listStream.map(t-> t.length());

    }
}
