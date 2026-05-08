package poo.atividades.atividade02.entidades;

public class Gerente extends FuncionarioAbstract {
    private double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
