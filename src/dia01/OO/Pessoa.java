package dia01.OO;

public class Pessoa {
    private String nome;
    private int idade;

    Pessoa () {
    }

    Pessoa (String nome, int idadePessoa) {
        this.nome = nome;
        idade = idadePessoa;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }




}



