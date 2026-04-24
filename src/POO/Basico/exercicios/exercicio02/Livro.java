package POO.Basico.exercicios.exercicio02;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    int anoDePublicacao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDePublicacao = anoDePublicacao;
    }

    public boolean ehLivroAntigo() {
        return this.anoDePublicacao > 20;
    }
}
