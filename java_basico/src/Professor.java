import java.util.Date;

public class Professor extends Pessoa {

    public Professor(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    public double salario;
    public String disciplina;

    public Professor(String nome, String cpf, Date data_nasc, double salario, String disciplina) {
        super(nome, cpf, data_nasc);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
