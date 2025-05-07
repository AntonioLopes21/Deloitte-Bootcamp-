package dia02.Desafio.models;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeMaxima = 200;
    private float velocidade = 0;

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
    System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano + "\n");
    }

    public void acelerar() {
        if(velocidade == velocidadeMaxima) {
            System.out.println("O veículo: " + this.getMarca() + this.getModelo() + " está na sua velocidade máxima!");
        } else {
            this.velocidade += 10;
            System.out.println("Velocidade aumentada: " + " + " + velocidade + " KM/H");
        }
    }

    public void frear() {
        this.velocidade -= 10;

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
        "\nObj - Veículo\n" +
        "Marca: " + marca +
        "\nModelo: " + modelo +
        "\nAno: " + ano;

    }
}
