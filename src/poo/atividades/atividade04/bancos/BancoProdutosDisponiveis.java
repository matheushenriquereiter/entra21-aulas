package poo.atividades.atividade04.bancos;

import poo.atividades.atividade04.entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoProdutosDisponiveis {
    private List<Produto> produtosDisponiveis = new ArrayList<>();

    public void adicionar(Produto produtoDisponivel) {
        produtosDisponiveis.add(produtoDisponivel);

        System.out.println("Produto '" + produtoDisponivel.getNome() + "' adicionado com sucesso!");
    }

    public List<Produto> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }
}
