package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex08 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double setor , alfa, raio;
        final double pi = 3.1416;

        System.out.print(" Digite a área do Setor :  ");
        setor = key.nextDouble();

        System.out.print(" Digite o Angulo :  ");
        alfa = key.nextDouble();

        raio = Math.sqrt((360 * setor) / (alfa * pi));

        System.out.printf(" Raio = %.4f%n ", raio);

        key.close();

    }

}
