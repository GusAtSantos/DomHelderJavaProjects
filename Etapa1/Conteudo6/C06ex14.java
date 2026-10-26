package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex14 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int numero, digito1, digito2, digito3, digito4;

        System.out.print("Digite um número inteiro de 4 dígitos: ");
         numero = key.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        } else {
             digito1 = numero / 1000;
             digito2 = (numero / 100) % 10;
             digito3 = (numero / 10) % 10;
             digito4 = numero % 10;

            System.out.println("Impressão = " + digito4 + "" + digito3 + "" + digito2 + "" + digito1);
        }

        key.close();
    }

}
