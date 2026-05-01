package poo.abstracao.exercicios.exercicio01;

public class Principal {
    public static void main(String[] args) {
        AnimalAbstract animal = new Cachorro("Jorge");

        System.out.println(animal.apresentar());
    }
}
