package poo.atividades.atividade03.entidades;

public class Post {
    private Usuario autor;
    private String mensagem;

    public Post(Usuario autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "Autor: %s, Mensagem: %s".formatted(autor.getNome(), getMensagem());
    }
}
