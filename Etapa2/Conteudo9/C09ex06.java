package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex06 {

    static void main() {

        double num, den, serie;

        serie = 0;

        for (int aux = 1; aux <= 20; aux++) {
            num = aux;
            den = Math.sqrt(2 * aux);
            serie += num / den;
        }

        serie = 10 + serie;

        System.out.println("Valor da Série = " + serie);
    }

}


