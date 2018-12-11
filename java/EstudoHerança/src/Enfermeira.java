import java.util.Date;

public class Enfermeira extends Pessoa {
    public Enfermeira(int idCadastro, String nome, String cpf, Date dataNascimento) {
        super(idCadastro, nome, cpf, dataNascimento);
    }
    private String coren;
    private String siglaEstadoCoren;
    private char setorEnfermaria;
}
