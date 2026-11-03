package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex13 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int termos, aux;
        double num, den, serie;

        do {
            System.out.print("Quantos termos terá a série? ");
            termos = key.nextInt();
        } while (termos < 1);

        serie = 0;
        aux = 1;

        while (aux <= termos) {
            num = aux * Math.pow(9 * aux + 1, 2 * aux);
            den = Math.pow(7, aux - 1);
            serie += num / den;
            aux++;
        }

        serie = 71 + Math.cbrt(serie);

        System.out.println("Valor da Série = " + serie);

        key.close();
    }
}