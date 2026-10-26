package Provas;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class D30869A {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double fx, x;

        System.out.print(" Digite o valor de X :  ");
        x = key.nextDouble();

        fx = 3 / 4.0 * Math.pow(x,7) - 4 * Math.sqrt(Math.pow(x,3) + 1 ) / 4.51  + (5 + x) / 2.0;

        System.out.printf(" O valor de F(x) = %.4f%n" , fx);

        key.close();

    }

}
