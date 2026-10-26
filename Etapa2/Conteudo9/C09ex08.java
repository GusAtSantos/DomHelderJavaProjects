package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex08 {

    static void main() {

        double num, den, serie;

        serie = 0;

        for (int aux = 1; aux <= 20; aux++) {
            num = (2 * aux + 1) * Math.sqrt(4 * aux + 1);
            den = Math.pow(5, aux);
            serie += num / den;
        }

        serie = Math.pow(serie, 2);

        System.out.println("Valor da Série = " + serie);

    }

}
