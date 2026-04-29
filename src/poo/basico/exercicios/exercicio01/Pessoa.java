package poo.basico.exercicios.exercicio01;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public boolean ehMaiorDeIdade() {
        return this.idade >= 18;
    }
}
