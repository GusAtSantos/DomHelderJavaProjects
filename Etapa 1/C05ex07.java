package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex07 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double fx, x, parte1, parte2;

        System.out.print(" Digite o valor de X :  ");
        x = key.nextDouble();

        parte1 = Math.pow((x / 4.0) + 1 , 2);
        parte2 = (1.0 / 5.0) * x ;
        fx = Math.sqrt(parte1 + parte2);

        System.out.printf(" F(x) = %.4f%n " , fx );

        key.close();

    }

}
