package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C09ex03 {

    static void main() {

        Scanner key = new Scanner(System.in);

        int termos;

        double num, den, serie;

        serie = 0;

        System.out.print(" Informe a quantidade de termos :  ");
        termos = key.nextInt();

        for (int aux = 1; aux <= termos; aux ++){
            num = 1 + Math.sqrt(4 * aux);

            den = 3 * aux;

            serie += num / den;
        }

        System.out.println(" Valor da Série :  " + serie);

        key.close();

    }

}
