import java.util.Date;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;

    public Funcionario(String nome, String cpf, Date data_nasc, double salario, Date data_admissao, String cargo) {
        super(nome, cpf, data_nasc);
        this.salario = salario;
        this.data_admissao = data_admissao;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
