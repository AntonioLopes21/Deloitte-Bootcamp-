package dia02.Desafio.models;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade = 0;


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
    System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void acelerar(float velocidade) {
        this.velocidade += velocidade;
        System.out.println("Velocidade aumentada: " + " + " + velocidade + " KM/H");

    }

    public void frear(float velocidade) {
        this.velocidade -= velocidade;

        if (this.velocidade <= 0) {
            System.out.println("Veículo parado...");
            this.velocidade = 0;
        } else {
            System.out.println("desacelerando..." + this.velocidade + " KM/H");
        }
    }

    @Override
    public String toString() {
        return
        "Marca: " + marca +
        "\nModelo: " + modelo +
        "\nAno: " + ano;

    }
}
