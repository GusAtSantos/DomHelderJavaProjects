package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex06 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double a, b, c, x, y, numerador, denominador, distancia;

        System.out.print(" Digite o valor de A : ");
        a = key.nextDouble();

        System.out.print(" Digite o valor de B : ");
        b = key.nextDouble();

        System.out.print(" Digite o valor de C : ");
        c = key.nextDouble();

        System.out.print(" Digite o valor de X : ");
        x = key.nextDouble();

        System.out.print(" Digite o valor de Y : ");
        y = key.nextDouble();

        numerador = a * x + b * y + c;
        denominador = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        distancia = numerador / denominador;

        System.out.printf(" Distância = %.4f%n " , distancia);

        key.close();

    }

}
