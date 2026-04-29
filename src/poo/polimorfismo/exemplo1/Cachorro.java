package poo.polimorfismo.exemplo1;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void perseguirCarteira() {
        System.out.println("Perseguindo carteira!");
    }
}
