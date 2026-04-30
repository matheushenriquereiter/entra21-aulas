package poo.polimorfismo.exemplo02;

public class Funcionario {
    private double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento() {
        return salarioBase;
    }
}
