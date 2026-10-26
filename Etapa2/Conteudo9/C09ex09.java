package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C09ex09 {

    static void main() {

        Scanner key = new Scanner(System.in);

        int termos;
        double num, den, serie;

        serie = 0;

        System.out.print("Informe a quantidade de termos: ");
        termos = key.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            num = Math.pow(3, aux + 1);
            den = (aux + 9) * Math.sqrt(Math.pow(aux, 4));
            serie += num / den;
        }

        serie = 100 - Math.pow(serie, 3);

        System.out.println("Valor da Série = " + serie);

        key.close();

    }

}
