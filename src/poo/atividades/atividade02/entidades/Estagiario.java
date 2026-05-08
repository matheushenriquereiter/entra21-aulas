package poo.atividades.atividade02.entidades;

public class Estagiario extends FuncionarioAbstract {
    private double valorHora;
    private int horasTrabalhadas;

    public Estagiario(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
