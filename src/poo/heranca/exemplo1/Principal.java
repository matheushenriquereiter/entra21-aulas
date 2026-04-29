package poo.heranca.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jorge", 22);
        Aluno aluno = new Aluno("Daniel", 88, "434242");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade alno: " + aluno.getIdade());
        System.out.println("Matrícula aluno: " + aluno.getMatricula());
    }
}
