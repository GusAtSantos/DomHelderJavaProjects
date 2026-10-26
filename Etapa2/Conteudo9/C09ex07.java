package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex07 {

    static void main() {

        double num, den, serie;

        serie = 0;

        for (int aux = 1; aux <= 6; aux++) {
            num = 2 * (aux - 1) + 3 * aux;
            den = 6 * aux + 1;
            serie += num / den;
        }

        System.out.println("Valor da Série = " + serie);
    }

}


