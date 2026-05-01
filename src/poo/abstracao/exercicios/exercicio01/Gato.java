package poo.abstracao.exercicios.exercicio01;

public class Gato extends AnimalAbstract {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau!");
    }
}
