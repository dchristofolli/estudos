import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    public String matricula;

    public Aluno(String nome, String cpf, Date data_nasc, String matricula) {
        super(nome, cpf, data_nasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
