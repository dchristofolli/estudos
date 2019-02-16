import java.util.Optional;

public class Empresa {
   static Funcionario funcionario[] = new Funcionario[5];

    public static void main(String[] args) {
        funcionario[0] = new Funcionario("Valdemar", 1, 1200.00);
        funcionario[1] = new Funcionario("Paulo", 2, 1700.00);
        funcionario[2] = new Funcionario("Julia", 3, 1100.00);
        funcionario[3] = new Funcionario("Angela", 4, 2200.00);

        Optional<Funcionario> nulo = Optional.empty();
//        Optional<String> retorno = Optional.of(buscaPorMatricula(""));
        Optional<String> buscaMatricula = Optional.ofNullable(buscaPorMatricula(""));
        if (buscaMatricula.isPresent())
            System.out.println("Funcionário encontrado");
        else
            System.out.println("Funcionário não encontrado");

        System.out.println(buscaMatricula);
    }
    private static String buscaPorMatricula(String nome){
        int num = 1;
        for(int i=0; i<=3; i++){
            if (funcionario[i].getMatricula() == num)
                nome = funcionario[i].getNome();
        }
        return nome;
    }
}