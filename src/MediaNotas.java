import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int quantidadeVezes = 3;

        for (int i = 0; i < quantidadeVezes; i++) {
            System.out.println("Digite o " + (i + 1) + " valor:" );
            double valor = sc.nextInt();

            soma += valor;
        }

        double media = soma / quantidadeVezes;

        System.out.println("A média dos valores é: " + (soma / 3));

        if(media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else if(media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
}
