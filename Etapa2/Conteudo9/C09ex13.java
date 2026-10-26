package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex13 {

    static void main() {

        double num, den, fatorial, serie;

        serie = 0;
        fatorial = 1;

        for (int aux = 1; aux <= 10; aux++) {
            fatorial *= aux;
            num = fatorial;
            den = Math.pow(2, aux) - 1;

            if (aux % 2 != 0) {
                serie += num / den;
            } else {
                serie -= num / den;
            }
        }

        System.out.println("Valor da Série = " + serie);

    }

}
