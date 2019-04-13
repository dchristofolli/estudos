public class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}