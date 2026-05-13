package poo.atividades.atividade04;

import poo.atividades.atividade04.bancos.BancoPedido;
import poo.atividades.atividade04.bancos.BancoProdutosDisponiveis;
import poo.atividades.atividade04.entidades.Produto;

import java.util.Scanner;

public class SistemaPedidosProcedural {
    public static BancoProdutosDisponiveis bancoProdutosDisponiveis = new BancoProdutosDisponiveis();
    public static BancoPedido bancoPedido = new BancoPedido(bancoProdutosDisponiveis);

    public static void main(String[] args) {
        bancoProdutosDisponiveis.adicionar(new Produto("Laptop", 1500.00d));
        bancoProdutosDisponiveis.adicionar(new Produto("Mouse", 25.00d));
        bancoProdutosDisponiveis.adicionar(new Produto("Teclado", 75.00d));
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Sistema de Pedidos ---");
            System.out.println("1. Adicionar Item ao Pedido");
            System.out.println("2. Ver Pedido Atual");
            System.out.println("3. Finalizar Pedido e Calcular Total");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            scanner.nextLine();
            switch (opcao) {
                case 1:
                    int idProduto = lerInteiro(scanner, "ID do Produto: ", "ID inválido. Tente novamente.");
                    int quantidade = lerInteiro(scanner, "Quantidade: ", "Quantidade inválida. Tente novamente.");

                    bancoPedido.adicionarItem(idProduto, quantidade);
                    break;
                case 2:
                    bancoPedido.exibirPedido();
                    break;
                case 3:
                    bancoPedido.finalizarPedido();
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static int lerInteiro(Scanner scanner, String message, String errorMessage) {
        while (true) {
            System.out.println(message);
            String texto = scanner.nextLine();

            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException error) {
                System.out.println(errorMessage);
            }
        }
    }
}