package poo.heranca.exercicios.exercicio2;

public class Professor extends Pessoa {
    String disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void apresentar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Disciplina: " + this.getDisciplina());
    }
}
