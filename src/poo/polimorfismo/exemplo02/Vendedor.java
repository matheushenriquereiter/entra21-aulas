package poo.polimorfismo.exemplo02;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(double salarioBase, double comissao) {
        super(salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + this.comissao;
    }
}
