package poo.abstracao.exemplo01.classeAbstrata;

public class Circulo extends FormaGeometricaAbstract {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return raio * raio * Math.PI;
    }
}
