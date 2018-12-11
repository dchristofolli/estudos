import java.util.Date;

public class Funcionarios extends Pessoas {
    public Funcionarios(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    int num_matricula; // número de matrícula será gerado e incrementado automaticamente
    Date data_admissao;
    double salario;
}
