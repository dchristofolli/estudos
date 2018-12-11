import java.util.Date;

public class Medicos extends Pessoas {

    public Medicos(String nome, String cpf, Date data_nasc) {
        super(nome, cpf, data_nasc);
    }
    String crm;
    String sigla_estado;
    double vencimentos;
}
