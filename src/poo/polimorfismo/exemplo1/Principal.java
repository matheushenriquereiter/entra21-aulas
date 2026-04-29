package poo.polimorfismo.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal rex = new Cachorro();
        rex.emitirSom();

        Animal animalGenerico = new Animal();
        animalGenerico.emitirSom();

        Animal sushi = new Gato();
        sushi.emitirSom();

//        rex.perseguirCarteira();
        if (rex instanceof Cachorro rexCachorro) {
            rexCachorro.perseguirCarteira();
        }
    }
}
