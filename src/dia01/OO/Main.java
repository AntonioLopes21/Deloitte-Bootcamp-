package dia01.OO;

public class Main {
    public static void main(String[] args) {
        AcaoPessoa comparacao = new AcaoPessoa();

        Pessoa pessoa1 = new Pessoa("Pedro", 30);
        Pessoa pessoa2 = new Pessoa("Luis", 30);

        comparacao.compararIdade(pessoa1, pessoa2);

        pessoa1.verificarMaioridade();
        pessoa2.verificarMaioridade();

    }
}
