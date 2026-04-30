package poo.encapsulamento.exemplo01;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(null);
        pessoa.setNome("");
        pessoa.apresentar();
    }
}
