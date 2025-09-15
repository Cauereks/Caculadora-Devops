package Calculadora;

public class Calculadora {

    // Método de multiplicação
    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int resultado = multiplicacao(5, 3);
        System.out.println("Multiplicação: " + resultado);
    }
}

