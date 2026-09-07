package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C04ex01 {

    static void main(String[] args) {

        String nome, nomeDoMeio, sobrenome;
        int idade;
        Scanner key = new Scanner(System.in);
        System.out.print(" QUal o seu nome?: ");
        nome = key.nextLine();
        System.out.print(" Qual o seu nome do meio?: ");
        nomeDoMeio = key.nextLine();
        System.out.print(" Qual o seu sobrenome?: ");
        sobrenome = key.nextLine();
        System.out.print(" Qual a sua idade?: ");
        idade = key.nextInt();
        System.out.println(" Olá: " + sobrenome + ", " + nome + " " + nomeDoMeio);
        System.out.println(" Sua Idade: " + idade + "Anos.");
        key.close();

    }

}
