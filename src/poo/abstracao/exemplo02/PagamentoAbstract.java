package poo.abstracao.exemplo02;

public abstract class PagamentoAbstract {
    private double valor;

    public PagamentoAbstract(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public abstract void processar();
}
