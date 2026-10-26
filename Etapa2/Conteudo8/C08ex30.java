package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C08ex30 {

    static void main() {

        Scanner key = new Scanner(System.in);

        double x, soma;
        int n;

        System.out.print("Digite x: ");
        x = key.nextDouble();

        System.out.print("Digite n: ");
        n = key.nextInt();

        soma = Math.log(x);

        for (int aux = 1; aux <= n; aux++) {
            soma += Math.pow(x, aux) / aux;
        }

        System.out.printf("S = %.0f%n", soma);

        key.close();

    }

}
