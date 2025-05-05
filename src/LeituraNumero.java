import javax.crypto.spec.PSource;
import java.util.Scanner;

public class LeituraNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        double valor2 = scan.nextInt();

        int resultado = (int) valor1 + (int) valor2;

        System.out.printf("O resultado é %d", resultado);
    }
}
