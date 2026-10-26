package Etapa1;

// Gustavo Rafael Atanasio Dos Santos

import java.util.Scanner;

public class C05ex11 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int number, banco, agencia, sequencial;

        System.out.print(" Qual o número do cheque? :  ");
        number = key.nextInt();

        banco = number / 1000 /1000 ;
        agencia = number /1000 %1000;
        sequencial = number %1000;

        System.out.println("-------------------------------");
        System.out.println(" Banco : " + banco + "\n" + " Agência : " + agencia + "\n" + " Sequencial : " + sequencial);
        System.out.println("-------------------------------");

        key.close();

    }

}
