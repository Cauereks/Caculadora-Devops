package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora por Operador ===");

        System.out.print("Digite a operação (ex: 5 + 3): ");
        int num1 = scanner.nextInt();
        String operador = scanner.next(); // pega +, -, *
        int num2 = scanner.nextInt();

        int resultado = 0;
        boolean valido = true;

        switch (operador) {
            case "+":
                resultado = Calculadora.soma(num1, num2);
                break;
            case "-":
                resultado = Calculadora.subtracao(num1, num2);
                break;
            case "*":
                resultado = Calculadora.multiplicacao(num1, num2);
                break;
            default:
                System.out.println("Operador inválido!");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
