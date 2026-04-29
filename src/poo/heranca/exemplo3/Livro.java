package poo.heranca.exemplo3;

public class Livro extends Produto {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Autor: " + this.autor);
        System.out.println("Preço: R$" + this.getPreco());
    }
}
