package POO.Basico.encapsulamento.exemplo1;

import POO.Basico.encapsulamento.exemplo1.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(null);
        pessoa.setNome("");
        pessoa.apresentar();
    }
}
