import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private Date data_nasc;

    public Pessoa(String nome, String cpf, Date data_nasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }
}
