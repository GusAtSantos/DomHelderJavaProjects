package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex13 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int horaInicio, horaFim, horas, minutoInicio, minutoFim, totalInicio,totalFim,duracaoMinutos,minutos ;

        System.out.print("Hora inicial: ");
         horaInicio = key.nextInt();
        System.out.print("Minuto inicial: ");
         minutoInicio = key.nextInt();

        System.out.print("Hora final: ");
         horaFim = key.nextInt();
        System.out.print("Minuto final: ");
         minutoFim = key.nextInt();

         totalInicio = horaInicio * 60 + minutoInicio;
         totalFim = horaFim * 60 + minutoFim;

         duracaoMinutos = totalFim - totalInicio;

         horas = duracaoMinutos / 60;
         minutos = duracaoMinutos % 60;

        System.out.println("O jogo durou " + horas + " horas e " + minutos + " minutos");

        key.close();
    }

}
