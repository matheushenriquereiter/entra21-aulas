package poo.atividades.atividade01;

import poo.atividades.atividade01.bancos.BancoProdutos;
import poo.atividades.atividade01.entidades.Produto;

import java.util.Scanner;

public class SistemaInventarioProcedural {
    public static BancoProdutos bancoProdutos = new BancoProdutos();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Inventário ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Calcular Valor Total do Estoque");
            System.out.println("0. Sair");

            opcao = lerInteiro(scanner, "Opção: ");

            if (opcao < 0 || opcao > 3) {
                System.out.println("Entrada inválida. Por favor, digite uma opção válida.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    if (nome == null || nome.trim().isEmpty()) {
                        System.out.println("Entrada inválida. Por favor, digite um nome válido.");
                        break;
                    }

                    double preco = lerDouble(scanner, "Preço: ");

                    if (preco < 0) {
                        System.out.println("Entrada inválida. Por favor, digite um preço válido");
                        continue;
                    }

                    int quantidade = lerInteiro(scanner, "Quantidade: ");

                    if (quantidade < 0) {
                        System.out.println("Entrada inválida. Por favor, digite uma quantidade válida.");
                        continue;
                    }

                    Produto produto = new Produto(nome, preco, quantidade);
                    bancoProdutos.adicionar(produto);
                    break;
                case 2:
                    bancoProdutos.listarProdutos();
                    break;
                case 3:
                    bancoProdutos.calcularTotal();
                    break;
            }
        } while (opcao != 0);
    }

    public static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException erro) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
    }

    public static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException erro) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
            }
        }
    }
}
