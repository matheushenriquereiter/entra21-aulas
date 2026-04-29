package poo.encapsulamento.exercicios.exercicio02;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Declarar construtores => Carro carro = new Carro("Fiat", "Corsa")
    // É possível declarar vários construtores com argumentos distintos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Declarar os getters => retornam os atributos privados do objeto
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Declarar os setters => recebem um valor por argumento e setam um atributo especifico do objeto com esse valor
    // Só altera o valor do atributo do objeto se for um valor válido
    public void setMarca(String marca) {
        // if para verificar se a marca passada por argumento é vazia ou nula

        if (marca == null || marca == "") {
            // exibe uma mensagem se a marca for invalida
            System.out.println("Marca inválida. Valor nulo ou vazio.");
        } else {
            this.marca = marca;
        }
    }

    public void setModelo(String modelo) {
        // if para verificar se o modelo passado por argumento é vazia ou nula
        // Só altera o valor do atributo do objeto se for um valor válido

        if (modelo == null || modelo == "") {
            // exibe uma mensagem se o modelo for invalido
            System.out.println("Marca inválida. Valor nulo ou vazio.");
        } else {
            this.modelo = modelo;
        }
    }

    public void setAno(int ano) {
        // if para verificar se o ano passado por argumento é negativo
        // Só altera o valor do atributo do objeto se for um ano válido

        if (ano <= 0) {
            System.out.println("Ano invalido. Número não pode ser negativo.");
        } else {
            this.ano = ano;
        }
    }
}
