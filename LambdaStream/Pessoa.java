package LambdaStream;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa() {

    }
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
