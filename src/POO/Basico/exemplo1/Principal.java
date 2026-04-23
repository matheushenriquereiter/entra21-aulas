package POO.Basico.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[1000];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa("Jorge", 22, 70);
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.nome);
        }

        Pessoa pessoa1 = new Pessoa("Fernando", 18, 60);
        Pessoa pessoa2 = new Pessoa("Luigi", 78, 60);
        Pessoa pessoa3 = new Pessoa();

        pessoa1.apresentar();
        pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 1994;
        carro1.cor = "Vermelho";
        carro1.marca = "Mazda";
        carro1.modelo = "Miata MX-5";
        carro1.dono = pessoa1;

        carro1.ligar();
    }
}
