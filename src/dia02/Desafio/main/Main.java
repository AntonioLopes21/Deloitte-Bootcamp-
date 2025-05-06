package dia02.Desafio.main;

import dia02.Desafio.models.Caminhao;
import dia02.Desafio.models.Carro;
import dia02.Desafio.models.Motorista;
import dia02.Desafio.models.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Uno", 2024);
        Carro carro = new Carro("Ford", "Ka", 2020, 4);
        Caminhao caminhao = new Caminhao("Iveco", "s1", 2025, 5);

        Motorista motora = new Motorista("Carlos", "203444212");

        caminhao.exibirInformacoes();
        carro.exibirInformacoes();

        motora.atribuirVeiculo(carro);
        motora.atribuirVeiculo(caminhao);

        motora.dirigir(caminhao);

        motora.removerVeiculo(caminhao);

        motora.dirigir(carro);

        System.out.println(carro);

        System.out.println(carro.toString());
    }
}
