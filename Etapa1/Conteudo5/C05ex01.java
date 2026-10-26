package Etapa1;

//Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex01 {

    public static void main(String[] args) {

        double fx, x;

        Scanner key = new Scanner(System.in);

        System.out.print(" Digite o valor do X :  ");
        x = key.nextDouble();

        fx = Math.pow(x,3) + 4 * x + 10;
        System.out.print(fx);

    }

}
