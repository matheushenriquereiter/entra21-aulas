package poo.abstracao.exemplo01.interfaceExemplo;

import poo.abstracao.exemplo01.classeAbstrata.FormaGeometricaAbstract;

public class Retangulo implements IFormaGeometrica {
    private  double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
