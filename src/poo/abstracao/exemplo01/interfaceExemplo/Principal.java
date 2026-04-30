package poo.abstracao.exemplo01.interfaceExemplo;

import poo.abstracao.exemplo01.classeAbstrata.Circulo;
import poo.abstracao.exemplo01.classeAbstrata.FormaGeometricaAbstract;
import poo.abstracao.exemplo01.classeAbstrata.Retangulo;

public class Principal {
    public static void main(String[] args) {
        poo.abstracao.exemplo01.classeAbstrata.Circulo circulo = new Circulo(2);
        poo.abstracao.exemplo01.classeAbstrata.Retangulo retangulo = new poo.abstracao.exemplo01.classeAbstrata.Retangulo(3, 4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("A área do círculo é " + areaCirculo);
        System.out.println("A área do retângulo é " + areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo(2, 2);
        System.out.println("A área do quadrado é " + quadrado.calcularArea());
    }
}
