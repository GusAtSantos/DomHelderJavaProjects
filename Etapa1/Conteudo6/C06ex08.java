package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex08 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String nome;
        double altura, pesoMinimo, pesoMaximo;

        System.out.print("Digite o nome: ");
         nome = key.next();

        System.out.print("Digite a altura (em metros): ");
         altura = key.nextDouble();

         pesoMinimo = 20 * Math.pow(altura, 2);
         pesoMaximo = 25 * Math.pow(altura, 2);

        System.out.printf("%s, seu peso ideal fica entre %.2f e %.2f kg.%n", nome, pesoMinimo, pesoMaximo);

        key.close();

    }

}

