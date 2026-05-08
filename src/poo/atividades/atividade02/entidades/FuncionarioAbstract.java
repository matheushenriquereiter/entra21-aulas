package poo.atividades.atividade02.entidades;

public abstract class FuncionarioAbstract {
    private String nome;

    public FuncionarioAbstract(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}
