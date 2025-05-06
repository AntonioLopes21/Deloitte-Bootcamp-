package dia02.exercicio1;

public class Main {
    public static void main(String[] args) {
        CalculadoraIMC calc = new CalculadoraIMC(73.0, 1.75);

        calc.calcularIMC(calc);
    }
}
