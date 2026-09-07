package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex05 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int numero;

        System.out.print(" Digite um número inteiro :  ");
        numero = key.nextInt();

        if (numero % 5 == 0 && numero % 7 ==0){
            System.out.println(numero + " É divisível por 5 e 7 ao mesmo tempo ");
        } else {
            System.out.println(numero + " Não é divisível por 5 e 7 ao mesmo tempo.  ");
        }

        key.close();

    }

}
