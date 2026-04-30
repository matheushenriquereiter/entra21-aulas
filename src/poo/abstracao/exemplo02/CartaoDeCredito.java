package poo.abstracao.exemplo02;


public class CartaoDeCredito extends PagamentoAbstract {
    public CartaoDeCredito(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com cartão de crédito!");
    }
}