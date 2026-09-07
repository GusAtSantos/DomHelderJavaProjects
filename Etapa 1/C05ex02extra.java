package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C05ex02extra {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double tempo, velocidade, tempoRelativo, velocidadeDaLuz;

        System.out.print(" Digite o Tempo :  ");
        tempo = key.nextDouble();

        System.out.print(" Digite a Velocidade :  ");
        velocidade = key.nextDouble();

        velocidadeDaLuz = 3 * Math.pow(10,8);

        tempoRelativo = tempo * 1 / Math.sqrt(1 - Math.pow(velocidade,2) / Math.pow(velocidadeDaLuz , 2));

        System.out.printf(" Tempo Relativo = %.4f%n  " , tempoRelativo);

        key.close();

    }

}
