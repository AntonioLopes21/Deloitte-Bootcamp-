package dia02.exercicio2;

import java.util.Scanner;

public class ValidadorCPF {
    private String cpf;
    private int quantidadeCaracteres;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantidadeCaracteres() {
        return quantidadeCaracteres;
    }

    public void setQuantidadeCaracteres(int quantidadeCaracteres) {
        this.quantidadeCaracteres = quantidadeCaracteres;
    }

    public void validarCpf(ValidadorCPF cpfDigitado) {
        this.cpf = cpf;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu cpf:");
        this.cpf = scan.nextLine();

        if(cpf.length() != 11) {
            System.out.println("Formato inválido!");
        } else {
            System.out.println("CPF cadastrado com sucesso!\n" + cpfDigitado.getCpf());
        }



    }
}
