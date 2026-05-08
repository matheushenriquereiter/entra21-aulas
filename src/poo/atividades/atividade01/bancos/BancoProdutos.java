package poo.atividades.atividade01.bancos;

import poo.atividades.atividade01.entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);

        System.out.println("Produto adicionado!");
    }

    public void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Preço: R$" + produto.getPreco() +
                    " | Qtd: " + produto.getQuantidade());
        }
    }

    public void calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            double preco = produto.getPreco();
            int qtd = produto.getQuantidade();

            total += preco * qtd;
        }

        System.out.println("Valor total do estoque: R$ " + total);
    }
}
