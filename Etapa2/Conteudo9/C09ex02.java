package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

public class C09ex02 {

    static void main(String[] args) {

        double num, den, serie;

        serie = 0;

        for (int aux = 1; aux <= 100; aux ++){
            num = aux;
            den = Math.pow(aux,2) + (aux - 1);

            serie += num / den;
        }

        System.out.println(" Valor da Série : " + serie);

    }

}
