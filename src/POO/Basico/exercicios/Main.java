package POO.Basico.exercicios;

import POO.Basico.exemplo1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel", 88);
        Aluno aluno2 = new Aluno("Jackeline", 88);

        aluno1.estudar();
        aluno2.estudar();

        Pessoa titular = new Pessoa("Jorge", 22, 60);
        ContaBancaria contaBancaria = new ContaBancaria(titular, 200);

        System.out.println(contaBancaria.saldo);

        contaBancaria.sacar(200);
        contaBancaria.depositar(100);
        contaBancaria.sacar(100);
        contaBancaria.sacar(100);
    }
}
