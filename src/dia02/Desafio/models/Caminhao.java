package dia02.Desafio.models;

public class Caminhao extends Veiculo{
    private float capacidadeCarga;



    public Caminhao (String marca, String modelo, int ano, float capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade Carga: " + this.capacidadeCarga);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidade de carga:" + capacidadeCarga + " Toneladas";
    }
}
