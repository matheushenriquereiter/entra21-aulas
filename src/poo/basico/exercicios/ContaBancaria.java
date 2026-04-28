package poo.basico.exercicios;

import poo.basico.exemplo1.Pessoa;

public class ContaBancaria {
    Pessoa titular;
    double saldo;

    public ContaBancaria(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public ContaBancaria(Pessoa titular, double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }

        this.titular = titular;
    }

    public String depositar(double valor) {
        if (valor <= 0) {
            return "Valor de deposito inválido...";
        }

        this.saldo += valor;
        return "Valor depositado! Saldo atual: R$%.2f".formatted(this.saldo);
    }

    public String sacar(double valor) {
        if (valor <= 0) {
            return "Valor de saque inválido...";
        }

        if (valor > saldo) {
            return "saldo insuficiente...";
        }

        this.saldo -= valor;
        return "Valor sacado! Saldo atual: R$%.2f".formatted(this.saldo);
    }
}
