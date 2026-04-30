package poo.abstracao.exemplo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escolha uma forma de pagamento");
        System.out.println("[1] PIX");
        System.out.println("[2] Boleto");
        int formaDePagamento = scanner.nextInt();
        scanner.nextLine();

        if (formaDePagamento == 1) {
            PagamentoAbstract pagamentoAbstract = new Pix(valorCompra);
            pagamentoAbstract.processar();
        } else if (formaDePagamento == 2) {
            PagamentoAbstract pagamentoAbstract = new Boleto(valorCompra);
            pagamentoAbstract.processar();
        } else {
            System.out.println("Digite certo aí mano!");
        }
    }
}
