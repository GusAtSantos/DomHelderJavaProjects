package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex09 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double nota1, nota2, nota3, media, somaPonderada;

        System.out.print(" Digite a primera nota :  ");
        nota1 = key.nextDouble();

        System.out.print(" Digite a segunda nota :  ");
        nota2 = key.nextDouble();

        System.out.print(" Digite a tercerira nota :  ");
        nota3 = key.nextDouble();

        somaPonderada = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
        media = somaPonderada / (2 + 3 + 5);

    System.out.printf( " Media final = %.2f%n " , media);

        key.close();

    }

}
