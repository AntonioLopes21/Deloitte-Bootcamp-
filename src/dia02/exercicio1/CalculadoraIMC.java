package dia02.exercicio1;

public class CalculadoraIMC {
    //fórmula: IMC = peso / (altura x altura).
    private double peso;
    private double altura;
    private double imc;

    public CalculadoraIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public void calcularIMC(CalculadoraIMC calculadoraIMC) {
        this.peso = peso;
        this.altura = altura;

        imc = peso/(altura * altura);

        classificarIMC(imc);

        System.out.printf("Seu imc é: %.2f", imc);

    }

    public void classificarIMC(double imc) {
        this.imc = imc;

        if(imc > 0 && imc < 18.5) {
            System.out.println("Magreza");
        } else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if(imc >= 25 && imc <= 29.9) {
            System.out.println("sobrepeso");
        } else if(imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if(imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else if(imc >= 40) {
            System.out.println("Obesidade grau 3");
        }
    }
}
