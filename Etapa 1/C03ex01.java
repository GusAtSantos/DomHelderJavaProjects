package Etapa1;

//Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C03ex01 {

    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print(" Inrforme um número : ");
        long numero = teclado.nextLong();
        long   fatorial = 1L;
        for(long contador = 2; contador <= numero; contador++){
            fatorial = fatorial * contador;
        }
        System.out.println(" Fatorial = " + fatorial);
        teclado.close();
    }

}
