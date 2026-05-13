package poo.atividades.atividade04.entidades;

public class Produto {
    private static int proximoId = 1;
    private final int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = gerarProximoId();
        setNome(nome);
        setPreco(preco);
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

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório e não pode ser nulo ou vazio.");
        }

        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço do produto não pode ser negativo. Valor informado: " + preco);
        }

        this.preco = preco;
    }
}
