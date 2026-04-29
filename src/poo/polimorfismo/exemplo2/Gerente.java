package poo.polimorfismo.exemplo2;

public class Gerente extends Funcionario {
    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + 1000d;
    }
}
