package poo.abstracao.exemplo01.interfaceExemplo;

public class Circulo implements IFormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }
}
