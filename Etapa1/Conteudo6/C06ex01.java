package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex01 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double x, fx;

        System.out.print(" Digite o valor de X :  ");
        x = key.nextDouble();

        if (x < 4){
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x,2));
        } else if (x == 4) {
            fx = 0;
        }else {
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x,2) - 16);
        }

        System.out.printf(" f(x) = %.4f%n" , fx );

        key.close();

    }

}
