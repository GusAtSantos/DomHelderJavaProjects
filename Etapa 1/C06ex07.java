package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex07 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double salario, valorFixo, percentual, plBruto, plLiquido, impostoRenda;

        System.out.print("Digite o salário: ");
         salario = key.nextDouble();

        if (salario <= 300) {
            valorFixo = 500;
            percentual = 0.70;
        } else if (salario <= 1000) {
            valorFixo = 200;
            percentual = 0.50;
        } else {
            valorFixo = 0;
            percentual = 0.30;
        }

         plBruto = valorFixo + (percentual * salario);
         impostoRenda = 0.25 * plBruto;
         plLiquido = plBruto - impostoRenda;

        System.out.printf("PL Líquido = R$%.2f%n", plLiquido);

        key.close();

    }

}
