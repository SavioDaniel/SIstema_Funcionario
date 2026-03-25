package test;

import dominio.Funcionario;
import dominio.Gerente;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario(3578, "Savio", 1);
        System.out.println("===== FUNCIONARIO =====");
        funcionario.imprime();
        System.out.println("Bonus: " + funcionario.calcularBonus());

        System.out.println("--------------------------");

        Gerente gerente = new Gerente(2450, "Rebeca", 2);
        System.out.println("===== GERENTE =====");
        gerente.imprime();
    }
}
