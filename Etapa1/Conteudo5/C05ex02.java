package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex02 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double raio, volume, area;
        final double pi = 3.1416;

        System.out.print(" Digite o raio da esfera :  ");
        raio = key.nextDouble();

        area = 4 * pi * Math.pow(raio,3);
        volume = (4.0/3.0) * pi * Math.pow(raio,3);

        System.out.printf(" Área = %6f%n ", area);
        System.out.printf(" Volume = %6f%n ", volume);

        key.close();

    }

}
