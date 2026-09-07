package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex03 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double vendas, comissao, salario = 240.0;

        System.out.print(" Digite o valor total das suas vendas este mês : R$ ");
        vendas = key.nextDouble();

        if (vendas <= 1000) {
            comissao = 0;
        } else if (vendas <= 10000) {
            comissao = vendas * 0.10;
        }else {
            comissao = 1000 ;
        }

        salario = salario + comissao;

        System.out.printf(" Salario = %.2f%n " , salario);

        key.close();

    }


}
