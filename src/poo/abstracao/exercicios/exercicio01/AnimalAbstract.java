package poo.abstracao.exercicios.exercicio01;

public abstract class AnimalAbstract {
    private String nome;

    public AnimalAbstract(String nome) {
        this.nome = nome;
    }

    public String apresentar() {
        System.out.println(this.getClass().getSimpleName());
        return this.nome;
    }

    public abstract void emitirSom();
}
