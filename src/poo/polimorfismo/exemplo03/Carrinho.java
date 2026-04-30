package poo.polimorfismo.exemplo03;

public class Carrinho {
    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(MetodoPagamento metodoPagamento) {
        metodoPagamento.pagarAVista();
        System.out.println("Compra realizada com sucesso!");
    }
}
