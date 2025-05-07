package dia02.Desafio.models;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculoAtual;
    List <Veiculo> veiculosPossuidos = new ArrayList<>();

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    //métodos
    public void atribuirVeiculo(Veiculo veiculo) {
        String nomeMotorista = this.getNome();
        this.veiculoAtual = veiculo;

        if(veiculosPossuidos.isEmpty()) {
            System.out.println("None");
        }

        veiculosPossuidos.add(veiculo);
        System.out.println(nomeMotorista + " possui o(s) veículo(s):" + veiculosPossuidos);
    }

    public void removerVeiculo(Veiculo veiculo) {
        String nomeMotorista = this.getNome();
        this.veiculoAtual = veiculo;

        if(veiculosPossuidos.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else if(veiculosPossuidos.contains(veiculo)) {

            veiculosPossuidos.remove(veiculo);

            System.out.println("Veículo removido com sucesso!");
        }
    }

    public void dirigir(Veiculo veiculo) {
        System.out.println(this.nome + " está dirigindo o " + veiculo);
    }

    @Override
    public String toString() {
        return "\nNome do motorista:" + this.nome +
                ", Cnh:" + this.cnh +
                ", Veículos registrados: " + this.veiculosPossuidos ;

    }
}
