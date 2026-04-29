package poo.encapsulamento.exercicios.exercicio01;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Diario de um banana", "Jorge");

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
    }
}
