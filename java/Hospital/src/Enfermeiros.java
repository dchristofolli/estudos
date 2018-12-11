import java.util.Date;

public class Enfermeiros extends Pessoas {
    public Enfermeiros(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    String coren;
    String sigla_estado;
    int num_matricula; // número de matrícula será gerado e incrementado automaticamente
    Date data_admissao;
    double salario;
}
