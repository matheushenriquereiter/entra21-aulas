package poo.heranca.exemplo02;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Jean", 100_000d, 500_000d);

        System.out.println("O salário total do " + vendedor.getNome() + " é " + vendedor.getSalarioTotal());
    }
}
