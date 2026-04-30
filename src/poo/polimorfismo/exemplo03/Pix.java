package poo.polimorfismo.exemplo03;

public class Pix extends MetodoPagamento {
    @Override
    public void pagarAVista() {
        System.out.println("Pagando à vista com PIX");
    }
}
