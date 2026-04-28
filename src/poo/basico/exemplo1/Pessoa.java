package poo.basico.exemplo1;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa() {}

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    void apresentar() {
        System.out.println("Olá meu nome é " + this.nome);
    }
}
