package Etapa1;

// Gustavo Rafael Atanasio dos Santo

import java.util.Scanner;

public class C03ex02 {

   public static void main( String[] args) {

       long n1, n2, n3, soma;
       double media;
       Scanner teclado = new Scanner(System.in);
       System.out.print(" Informe um número :  ");
       n1 = teclado.nextLong();
       System.out.print(" Informe outro número :  ");
       n2 = teclado.nextLong();
       System.out.print(" Informe mais um número : ");
       n3 = teclado.nextLong();
       soma = n1 + n2 + n3;
       media = soma / 3.0;
       System.out.println(" Média =  " + media);
       teclado.close();

    }
}
