package poo.atividades.atividade04.bancos;

import poo.atividades.atividade04.entidades.Item;
import poo.atividades.atividade04.entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoPedido {
    private static List<Item> itens = new ArrayList<>();

    private BancoProdutosDisponiveis bancoProdutosDisponiveis;

    public BancoPedido(BancoProdutosDisponiveis bancoProdutosDisponiveis) {
        this.bancoProdutosDisponiveis = bancoProdutosDisponiveis;
    }

    public void adicionar(Item item) {
        itens.add(item);

        System.out.println("Item '" + item.getProduto().getNome() + "' adicionado com sucesso!");
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(int idProduto, int quantidade) {
        boolean produtoEncontrado = false;

        for (Produto produtoDisponivel : bancoProdutosDisponiveis.getProdutosDisponiveis()) {
            if (produtoDisponivel.getId() == idProduto) {
                itens.add(new Item(produtoDisponivel, quantidade));
                System.out.println("Item adicionado ao pedido!");
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto com ID " + idProduto + " não encontrado.");
        }
    }

    public void exibirPedidoAtual() {
        System.out.println("\n--- Itens no Pedido ---");

        if (getItens().isEmpty()) {
            System.out.println("Nenhum item no pedido.");
            return;
        }

        for (Item item : getItens()) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();
            String nomeProduto = "Desconhecido";
            double precoProduto = 0.00d;

            for (Produto produtoDisponivel : bancoProdutosDisponiveis.getProdutosDisponiveis()) {
                if (produtoDisponivel.getId() == produto.getId()) {
                    nomeProduto = produtoDisponivel.getNome();
                    precoProduto = produtoDisponivel.getPreco();
                    break;
                }
            }

            System.out.println("Produto: " + nomeProduto + " (ID: " + produto.getId() + ") | Quantidade: " + quantidade + " | Preço Unitário: R$" + precoProduto);
        }
    }

    public void finalizarPedido() {
        System.out.println("\n--- Resumo do Pedido ---");

        double totalGeral = 0;
        if (getItens().isEmpty()) {
            System.out.println("Nenhum item no pedido para finalizar.");
            return;
        }

        for (Item item : getItens()) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();
            double precoUnitario = 0;
            String nomeProduto = "Desconhecido";

            for (Produto produtoDisponivel : bancoProdutosDisponiveis.getProdutosDisponiveis()) {
                if (produtoDisponivel.getId() == produto.getId()) {
                    precoUnitario = produto.getPreco();
                    nomeProduto = produto.getNome();
                    break;
                }
            }

            double subtotal = precoUnitario * quantidade;
            System.out.println(" " + nomeProduto + " x " + quantidade + " = R$" + String.format("%.2f", subtotal));
            totalGeral += subtotal;
        }

        System.out.println("------------------------");
        System.out.println("Total do Pedido: R$" + String.format("%.2f", totalGeral));
        getItens().clear();
        System.out.println("Pedido finalizado!");
    }
}
