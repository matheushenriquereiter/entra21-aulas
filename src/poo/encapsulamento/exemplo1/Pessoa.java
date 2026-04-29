package poo.encapsulamento.exemplo1;

public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            System.out.println("Nome não deve ser nulo nem vazio");
            return;
        }

        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void apresentar() {
        System.out.println("Meu nome é " + this.nome);
        System.out.println("Meu nome tem " + nome.length() + "letras");
    }
}
