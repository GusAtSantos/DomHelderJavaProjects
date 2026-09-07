package Etapa1;

/* Gustavo Rafael Atanasio Dos Santos */

import java.util.Scanner;

public class C05ex05 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double celcius, fahrenheit, kelvin ;

        System.out.print(" Digite a temperatura em Celcius :  ");
        celcius = key.nextDouble();

        kelvin = celcius + 273;
        fahrenheit = (9 * celcius + 160) / 5.0 ;

        System.out.printf(" Kelvin = %.2f%n " , kelvin);
        System.out.printf(" Fahrenheit = %.2f%n " , fahrenheit);

        key.close();

    }

}
