package poo.atividades.atividade04.util;

import java.util.Scanner;

public class Leitor {
    public static int lerInteiro(Scanner scanner, String pergunta, String mensagemErro) {
        while (true) {
            System.out.println(pergunta);
            String texto = scanner.nextLine();

            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException error) {
                System.out.println(mensagemErro);
            }
        }
    }
}
