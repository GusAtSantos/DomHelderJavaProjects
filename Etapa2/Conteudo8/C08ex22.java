package Etapa2.Conteudo8;

/* Gustavo Rafael Atansio dos Santos */

import java.util.Scanner;

public class C08ex22 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int numero, contDivisores;

        contDivisores = 0;

        System.out.print("Digite um número inteiro maior que zero: ");
        numero = key.nextInt();

        for (int aux = 1; aux <= numero; aux++) {
            if (numero % aux == 0) {
                contDivisores++;
            }
        }

        if (contDivisores == 2) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        key.close();
    }

}
