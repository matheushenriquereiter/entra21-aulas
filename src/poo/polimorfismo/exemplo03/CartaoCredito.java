package poo.polimorfismo.exemplo03;

public class CartaoCredito extends MetodoPagamento {
    @Override
    public void pagarAVista() {
        System.out.println("Pagando à vista com cartão de crédito");
    }
}
