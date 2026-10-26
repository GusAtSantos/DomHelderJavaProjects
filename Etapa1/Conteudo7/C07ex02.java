package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C07ex02 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int nota1, nota2, nota3, notaFinal;

        System.out.print("Nota 1: ");
        nota1 = key.nextInt();
        System.out.print("Nota 2: ");
        nota2 = key.nextInt();
        System.out.print("Nota 3: ");
        nota3 = key.nextInt();

        notaFinal = (nota1 + nota2 + nota3) / 3;

        switch (notaFinal) {
            case 9: case 10:
                System.out.println("Conceito A");
                break;
            case 8:
                System.out.println("Conceito B");
                break;
            case 7:
                System.out.println("Conceito C");
                break;
            case 5: case 6:
                System.out.println("Conceito D");
                break;
            case 1: case 2: case 3: case 4:
                System.out.println("Conceito E");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }

        key.close();
    }

}
