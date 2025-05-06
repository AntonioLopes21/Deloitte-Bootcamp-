package dia02.exercicio3;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {}


    public void aplicarDesconto(Produto produto, double desconto) {
        double valorProduto = produto.getPreco();
        desconto /= 100;
        double valorDescontado = valorProduto *  desconto;
        System.out.println("Valor descontado: " + valorDescontado);


        valorProduto -= valorDescontado;
        System.out.printf("Produto aplicado com desconto: %.2f ", valorProduto);
    }
}
