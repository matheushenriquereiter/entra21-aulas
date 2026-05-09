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
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    String idProduto = scanner.nextLine();

                    System.out.print("Quantidade: ");
                    String quantidade = scanner.nextLine();

                    bancoPedido.adicionarItem(Integer.parseInt(idProduto), Integer.parseInt(quantidade));
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
}