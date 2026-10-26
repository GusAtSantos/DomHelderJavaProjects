package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex01 {

    static void main() {
        double num, den, serie;

        serie = 0;

        for (int aux = 1; aux <= 37; aux++) {
            num = (38 - aux) * (39 - aux);
            den = aux;
            serie += num / den;
        }

        System.out.println("Valor da Série = " + serie);
    }

}
