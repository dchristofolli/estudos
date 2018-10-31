import java.util.Scanner;

public class main {
    static Professor[] professor = new Professor[10];
    static Funcionario[] funcionario = new Funcionario[20];
    static Aluno[] aluno = new Aluno[200];
    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        System.out.println(">>>>> Menu <<<<< \n1- Cadastro de professor " +
                "\n2- Cadastro de funcionario \n3- Cadastro de aluno \n0- Sair \nDigite uma das opçoes: ");
        int escolha = Integer.parseInt(teclado("Digite uma das opçoes: "));
        if (escolha == 1)
            cadastra_professor();
        if (escolha == 2)
            cadastra_func();
        if (escolha == 3)
            cadastra_aluno();
        if (escolha == 0)
            System.exit(0);
        else {
            System.out.println("Opçao invalida!");
                menu();
        }
    }

    private static void cadastra_aluno() {
        System.out.println("Cadastro de aluno");
    }

    private static void cadastra_func() {
        System.out.println("Cadastro de funcionario");
    }

    private static void cadastra_professor() {
        System.out.println("Cadastro de professor");
    }

    private static String teclado(String texto) {
        texto = new Scanner(System.in).nextLine();
        return texto;
    }


}
