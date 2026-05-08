package poo.atividades.atividade02;

import poo.atividades.atividade02.entidades.Estagiario;
import poo.atividades.atividade02.entidades.FuncionarioAbstract;
import poo.atividades.atividade02.entidades.Gerente;

import java.util.ArrayList;
import java.util.List;

public class SistemaRHProcedural {
    private static final List<FuncionarioAbstract> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        funcionarios.add(new Gerente("João", 5000.0d));
        funcionarios.add(new Estagiario("Maria", 20.0d, 160)); // 20/hora * 160h
        funcionarios.add(new Gerente("Carlos", 6000.0d));
        processarFolha();
    }

    public static void processarFolha() {
        System.out.println("\n--- FOLHA DE PAGAMENTO ---");
        double totalEmpresa = 0;

        for (FuncionarioAbstract funcionario : funcionarios) {
            double salarioFinal = funcionario.calcularSalario();

            System.out.println("Funcionário: " + funcionario.getNome() + " | Salário: R$" + salarioFinal);
            totalEmpresa += salarioFinal;
        }

        System.out.println("Total a pagar: R$" + totalEmpresa);
    }
}