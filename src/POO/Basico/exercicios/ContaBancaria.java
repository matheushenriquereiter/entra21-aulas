package POO.Basico.exercicios;

import POO.Basico.exemplo1.Pessoa;

public class ContaBancaria {
    Pessoa titular;
    double saldo;

    public ContaBancaria(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public ContaBancaria(Pessoa titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Valor depositado! Saldo atual: R$%.2f%n", this.saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("saldo insuficiente...");
            return;
        }

        this.saldo -= valor;
        System.out.printf("Valor sacado! Saldo atual: R$%.2f%n", this.saldo);
    }
}
