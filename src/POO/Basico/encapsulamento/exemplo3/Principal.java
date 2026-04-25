package POO.Basico.encapsulamento.exemplo3;

public class Principal {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("1");
        Estudante estudante2 = new Estudante("2", 2);

        estudante1.adicionarNota(0, 10);
        estudante1.adicionarNota(1, 10);
        System.out.println(estudante1.calcularMedia());
    }
}
