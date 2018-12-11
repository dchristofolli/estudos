import java.util.Date;

public class Pacientes extends Pessoas {
    public Pacientes(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    int reg_paciente; // número do registro será gerado e incrementado automaticamente
    Date data_admissao;
    Date data_alta;
    String diagnostico;
    char setor_enfermagem;
}
