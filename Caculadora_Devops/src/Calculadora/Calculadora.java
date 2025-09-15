package Calculadora;

import java.util.Scanner;
import java.math.BigDecimal;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculadora (apenas subtração) ===");

        try {
            System.out.print("Digite o primeiro número: ");
            BigDecimal a = new BigDecimal(sc.nextLine().trim().replace(',', '.'));

            System.out.print("Digite o segundo número: ");
            BigDecimal b = new BigDecimal(sc.nextLine().trim().replace(',', '.'));

            BigDecimal resultado = a.subtract(b);
            System.out.println("Resultado: " + resultado.toPlainString());
        } catch (NumberFormatException ex) {
            System.out.println("Entrada inválida. Use um número válido (ex: 12.5 ou 10).");
        } finally {
            sc.close();
        }
    }
}
