package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C09ex05 {

    static void main() {

        Scanner key = new Scanner(System.in);

        int termos;
        double num, den, serie;

        serie = 0;

        System.out.print("Informe a quantidade de termos: ");
        termos = key.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            num = 2 * (aux - 1) + 3 * aux;
            den = 6 * aux + 1;
            serie += num / den;
        }

        serie = 5 * serie;

        System.out.println("Valor da Série = " + serie);

        key.close();

    }

}
