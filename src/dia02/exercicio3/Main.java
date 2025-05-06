package dia02.exercicio3;

public class Main {
    public static void main(String[] args) {
        Produto produtoNovo = new Produto("Doritos", "Salgadinho peso", 100);

        produtoNovo.aplicarDesconto(produtoNovo,20);

    }
}
