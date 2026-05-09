package poo.atividades.atividade04.bancos;

import poo.atividades.atividade04.entidades.Item;
import poo.atividades.atividade04.entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoPedido {
    private List<Item> itens = new ArrayList<>();
    private BancoProdutosDisponiveis bancoProdutosDisponiveis;

    public BancoPedido(BancoProdutosDisponiveis bancoProdutosDisponiveis) {
        this.bancoProdutosDisponiveis = bancoProdutosDisponiveis;
    }

    public void adicionarItem(int idProduto, int quantidade) {
        Produto produtoDisponivel = bancoProdutosDisponiveis.obterPorId(idProduto);

        if (produtoDisponivel == null) {
            System.out.println("Produto com ID " + idProduto + " não encontrado.");
            return;
        }

        itens.add(new Item(produtoDisponivel, quantidade));
        System.out.println("Item adicionado ao pedido!");
    }

    public void exibirPedido() {
        System.out.println("\n--- Itens no Pedido ---");

        if (itens.isEmpty()) {
            System.out.println("Nenhum item no pedido.");
            return;
        }

        for (Item item : itens) {
            System.out.println("Produto: " + item.getProduto().getNome() + " (ID: " + item.getProduto().getId() + ") | Quantidade: " + item.getQuantidade() + " | Preço Unitário: R$" + item.getProduto().getPreco());
        }
    }

    public void finalizarPedido() {
        System.out.println("\n--- Resumo do Pedido ---");

        double totalGeral = 0;
        if (itens.isEmpty()) {
            System.out.println("Nenhum item no pedido para finalizar.");
            return;
        }

        for (Item item : itens) {
            double subtotal = item.getProduto().getPreco() * item.getQuantidade();

            System.out.println(" " + item.getProduto().getNome() + " x " + item.getQuantidade() + " = R$" + String.format("%.2f", subtotal));
            totalGeral += subtotal;
        }

        System.out.println("------------------------");
        System.out.println("Total do Pedido: R$" + String.format("%.2f", totalGeral));
        itens.clear();
        System.out.println("Pedido finalizado!");
    }
}
