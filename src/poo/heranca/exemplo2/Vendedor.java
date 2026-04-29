package poo.heranca.exemplo2;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public Double getSalarioTotal() {
        return this.getSalarioBase() + comissao;
    }
}
