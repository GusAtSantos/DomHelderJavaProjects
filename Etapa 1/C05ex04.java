package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex04 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double x1, x2, y1, y2, distancia;

        System.out.print(" Digite o valor de X1 :  ");
        x1 = key.nextDouble();

        System.out.print(" Digite o valor de Y1 :  ");
        y1 = key.nextDouble();

        System.out.print(" Digite o valor de X2 :  ");
        x2 = key.nextDouble();

        System.out.print(" Digite o valor de Y2 :  ");
        y2 = key.nextDouble();

        distancia = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));

        System.out.println(" Distancia = " + distancia);

        key.close();

    }

}
