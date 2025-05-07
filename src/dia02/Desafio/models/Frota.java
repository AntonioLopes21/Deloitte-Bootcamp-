package dia02.Desafio.models;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    List<Veiculo> veiculos = new ArrayList<>();
    List<Motorista> motoristas = new ArrayList<>();

    public void adicionarVeiculoAFrota(Veiculo veiculo) {
        veiculos.add(veiculo);

        System.out.println("veículo adicionado a frota:" + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    public void adicionarMotoristaAFrota(Motorista motorista) {
        motoristas.add(motorista);

        System.out.println("Motorista adicionado a frota:" + motorista.getNome());
    }

    public void listarFrota() {
        if(motoristas.isEmpty()) {
            System.out.println("A lista de motoristas está vazia!");
        } else {
            System.out.println("Lista de motoristas:" + motoristas);

        }

        if(veiculos.isEmpty()) {
            System.out.println("A lista de veículos está vazia!");
        } else {
            System.out.println("Lista de veículos:" + veiculos);
        }

    }
}
