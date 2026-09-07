package Etapa1;

//Gustavo Rafael Atanasio Dos Santos

import java.util.Scanner;

public class C05ex10 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int number, d1, d2, d3, d4, d5;

        System.out.print(" Informe uma sequencia de 5 números :  ");
        number = key.nextInt();

        d1 = number / 10000;
        d2 = number / 1000 % 10;
        d3 = number / 100 % 10;
        d4 = number % 100 / 10;
        d5 = number % 10;

        System.out.println(" Impressão :  " + "\n" + d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" + d5);

        key.close();

    }

}
