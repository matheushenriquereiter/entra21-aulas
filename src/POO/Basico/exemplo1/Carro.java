package POO.Basico.exemplo1;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    void ligar() {
        if (dono == null) {
            System.out.println("Carro sem dono");
            return;
        }

        dono.apresentar();
        System.out.println("vruuuuuuuuuuuuum");
    }
}
