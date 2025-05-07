package dia02.Desafio.main;

import dia02.Desafio.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
        Veiculo veiculo = new Veiculo("Fiat", "Uno", 2024);
        Carro carro = new Carro("Ford", "Ka", 2020, 4);
        Caminhao caminhao = new Caminhao("Iveco", "s1", 2025, 5);
        Motorista motora = new Motorista("Carlos", "203444212");

        Frota frota = new Frota();

        caminhao.exibirInformacoes();
        carro.exibirInformacoes();

//        //teste de atribuição de veículo ao motorista
//        motora.atribuirVeiculo(carro);
//        motora.atribuirVeiculo(caminhao);
//        //métodos de dirigir do motorista
//        motora.dirigir(caminhao);
//        motora.dirigir(carro);
//
//        //método de remoção do veículo vinculado ao motorista
//        motora.removerVeiculo(caminhao);
//
//        //printando toString personalizado do veículo
//        System.out.println(carro);
//        System.out.println(carro.toString());
//
//        //toString caminhão
//        System.out.println(caminhao);
//
//        //testando frota
//        frota.adicionarMotoristaAFrota(motora);
//        frota.adicionarVeiculoAFrota(carro);
//
//        frota.listarFrota();
//
//        //set velocidade máxima
//        carro.setVelocidadeMaxima(300);
//        caminhao.setVelocidadeMaxima(150);
//
//        for (int i = 0; i <= 30; i++) {
//            carro.acelerar(motora);
//
//            if(i == carro.getVelocidadeMaxima()) {
//                break;
//            }
//        }
//
//        for (int i = 0; i <= 15; i++) {
//            caminhao.acelerar(motora);
//        }
//
//        frota.listarFrota();
//        System.out.println("-------------------------------------------------");

            Carro porche = new Carro("Porche", "Silveira", 2020, 5);

            porche.trocarMarcha(porche, motora);
            for (int i = 0; i < porche.getVelocidadeMaxima(); i++) {
                porche.acelerar(motora);
            }
        } catch (StackOverflowError e) {
            System.out.println("este campo está gerando excesso de memória por erro de loop.");
        }

    }
}
