package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C09ex04 {

    static void main() {

        Scanner key = new Scanner(System.in);

        int termos;

        double a, num, den, serie;

        serie = 0;

        System.out.print(" Indforme a quantidade de termos : ");
        termos = key.nextInt();

        for (int aux = 1; aux <= termos; aux ++){

            a = 4 * aux - 3;
            num = a * (a + 1);
            den = (a + 2) * (a + 3);

            serie += num / den;

        }

        serie = Math.sqrt(serie);

        System.out.println(" Valor da Série : " + serie);

        key.close();

    }

}
