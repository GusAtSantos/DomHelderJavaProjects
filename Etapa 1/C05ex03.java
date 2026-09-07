package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex03 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double salario, liquido, imposto;
        int dependentes;

        System.out.print(" Digite o seu salario :  ");
        salario = key.nextDouble();

        System.out.print(" Digite a quantidade de dependentes :  ");
        dependentes = key.nextInt();

        liquido = salario - (dependentes * 60.00);
        imposto = liquido * 0.15;

        System.out.printf(" Imposto de Renda = %.2f%n", imposto);

        key.close();

    }

}
