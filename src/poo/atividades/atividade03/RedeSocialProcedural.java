package poo.atividades.atividade03;

import poo.atividades.atividade03.entidades.Post;
import poo.atividades.atividade03.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class RedeSocialProcedural {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();

    public static void main(String[] args) {
        Usuario usuarioExemplo1 = new Usuario("Alice");
        Usuario usuarioExemplo2 = new Usuario("Bob");
        Post postExemplo1 = new Post(usuarioExemplo1, "Hoje o dia está lindo!");
        Post postExemplo2 = new Post(usuarioExemplo2, "Estudando POO com Java.");
        Post postExemplo3 = new Post(usuarioExemplo1, "Refatoração é vida.");

        cadastrarUsuario(usuarioExemplo1);
        cadastrarUsuario(usuarioExemplo2);
        criarPost(postExemplo1);
        criarPost(postExemplo2);
        criarPost(postExemplo3);
        exibirFeed();
    }

    public static void cadastrarUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)) {
            System.out.println("Usuário já existe.");
            return;
        }

        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " cadastrado.");
    }

    public static void criarPost(Post post) {
        if (!usuarios.contains(post.getAutor())) {
            System.out.println("Erro: Usuário " + post.getAutor().getNome() + " não encontrado.");
            return;
        }

        posts.add(post);
    }

    public static void exibirFeed() {
        System.out.println("\n--- FEED DE NOTÍCIAS ---");

        for (Post post : posts) {
            System.out.println(post);
        }
    }
}