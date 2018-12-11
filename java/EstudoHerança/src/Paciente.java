import java.util.Date;

public class Paciente extends Pessoa {
    public Paciente(int idCadastro, String nome, String cpf, Date dataNascimento) {
        super(idCadastro, nome, cpf, dataNascimento);
    }
    private boolean internado;
    private char setor;
    private short leito;
    private String diagnostico;
}
