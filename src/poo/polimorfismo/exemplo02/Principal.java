package poo.polimorfismo.exemplo02;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente(10_000d);

        System.out.println("O salário do gerente é: " + gerente.calcularPagamento());

        Funcionario funcionarioComum = new Funcionario(3_000d);
        System.out.println("O salário do funcionário é: " + funcionarioComum.calcularPagamento());

        Funcionario vendedor = new Vendedor(2_000d, 3_000d);
        System.out.println("O salário do vendedor é: " + vendedor.calcularPagamento());
    }
}
