package poo.basico.exercicios.exercicio02;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Livro do Jorge", "Jorge", 328, 21);

        System.out.println(livro.ehLivroAntigo());
    }
}
