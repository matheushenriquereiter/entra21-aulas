package poo.atividades.atividade04.entidades;

public class Produto {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = gerarProximoId();
        this.nome = nome;
        this.preco = preco;
    }

    private int gerarProximoId() {
        return proximoId++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
