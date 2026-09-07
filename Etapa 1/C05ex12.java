package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex12 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int horas, minutos, segundos, resto, segundosFinais;

        System.out.print(" Digite o tempo em segundos :  ");
        segundos = key.nextInt();

        horas = segundos / 3600;
        resto = segundos % 3600;

        minutos = resto / 60;
        segundosFinais = resto % 60;

        System.out.println(" Horas =  " + horas + " Minutos =  " + minutos + " Segundos = " + segundosFinais);

        key.close();

    }

}
