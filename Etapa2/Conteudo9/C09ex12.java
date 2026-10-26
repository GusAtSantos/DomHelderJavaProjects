package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex12 {

    static void main() {

        double num, den, serie;

        serie = 0;

        for (int aux = 1; aux <= 10000; aux++) {
            num = 1;
            den = 2 * aux - 1;

            if (aux % 2 != 0) {
                serie += num / den;
            } else {
                serie -= num / den;
            }
        }

        serie = 4 * serie;

        System.out.println("Valor de PI = " + serie);

    }

}
