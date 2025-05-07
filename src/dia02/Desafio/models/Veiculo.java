package dia02.Desafio.models;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeMaxima = 200;
    private float velocidade = 0;
    private int numeroDeMarchas = 5;
    private int marchaAtual = 0;

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

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


    public void trocarMarcha(Veiculo veiculo, Motorista motorista) {
        switch (numeroDeMarchas) {
            case 1:
                if(velocidade <= 10) {
                    System.out.println("Marcha Atual:" + marchaAtual + ", Troque de marcha para acelerar.");
                };
            break;

            case 2:
                if(velocidade > 10 && velocidade <= 30) {
                    System.out.println("Marcha Atual:" + marchaAtual + ", Troque de marcha para acelerar.");
                }
            break;

            case 3:
                numeroDeMarchas++;
                if(velocidade > 30 && velocidade <= 40) {
                    System.out.println("Marcha Atual:" + marchaAtual + ", Troque de marcha para acelerar.");
                }
            break;

            case 4:
                numeroDeMarchas++;
                if(velocidade > 40 && velocidade <= 80) {
                    System.out.println("Marcha Atual:" + marchaAtual + ", Troque de marcha para acelerar.");
                }
            break;

            case 5:
                if(velocidade > 80) {
                    System.out.println("Marcha Atual máxima.");
                }
            break;

            default:
                System.out.println("O veículo: " + this.marca + " " + this.modelo + " não possui marchas além das " + numeroDeMarchas + " marchas já existentes.");
        }

    }

    public void acelerar(Motorista motorista) {
        if(velocidade <= 10) {
            marchaAtual = 1;
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");
            trocarMarcha(this, motorista);
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");

        } else if (velocidade > 10 && velocidade <= 30) {
            marchaAtual = 2;
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");
            trocarMarcha(this, motorista);
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");

        } else if (velocidade > 30 && velocidade <= 40) {
            marchaAtual = 3;
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");
            trocarMarcha(this, motorista);
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");

        } else if (velocidade > 40 && velocidade <= 80) {
            marchaAtual = 4;
            System.out.println(this.getMarca() + " " + this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");
            trocarMarcha(this, motorista);
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");

        } else {
            marchaAtual = 5;
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");
            trocarMarcha(this, motorista);
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");

        }

        if(velocidade == velocidadeMaxima) {
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");
            System.out.println("O veículo: " + this.getMarca() + this.getModelo() + " está na sua velocidade máxima!");
            System.out.println(this.getModelo() +"\nVelocidade atual: " + velocidade + " KM");

        } else {
            this.velocidade += 10;
            System.out.println(motorista.getNome() + " acelerou o veículo.");
            System.out.println("Velocidade aumentada: " + " + " + velocidade + " KM/H");
        }
    }

    public void frear(Motorista motorista) {
        this.velocidade -= 10;
        if (this.velocidade <= 0) {
            System.out.println("Veículo parado...");
            this.velocidade = 0;
        } else {
            System.out.println(motorista.getNome() + " acionou o freio.");
            System.out.println("desacelerando..." + this.velocidade + " KM/H");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano + "\n");
    }

    @Override
    public String toString() {
        return
        "\nObj - Veículo" +
        " Marca: " + marca +
        ", Modelo: " + modelo +
        ", Ano: " + ano;

    }
}
