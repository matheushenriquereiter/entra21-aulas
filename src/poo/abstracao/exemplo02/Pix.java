package poo.abstracao.exemplo02;

public class Pix extends PagamentoAbstract {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com PIX!");
    }
}
