package basico;

import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        try {
            int division = num1 / num2;

            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Não pode dividir por 0");
        }

        if (num2 == 0) {
            System.out.println("Não pode dividir por 0");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
