package poo.polimorfismo.exemplo01;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void perseguirCarteira() {
        System.out.println("Perseguindo carteira!");
    }
}
