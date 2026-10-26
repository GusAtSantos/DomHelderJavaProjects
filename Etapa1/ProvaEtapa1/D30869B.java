package Provas;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class D30869B {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int numero, n1, n2, n3 ;
        double armstrong;

        System.out.print(" Informe um número inteiro de apenas 3 dígitos :  ");
        numero = key.nextInt();

        if (numero >= 100 && numero <= 999){

            n1 = numero / 100;
            n2 = numero % 100 / 10;
            n3 = numero % 10 ;

            armstrong = Math.pow(n1,3) + Math.pow(n2 ,3) + Math.pow(n3,3);

            if (armstrong == numero){

                System.out.println(numero + " Tem a propriedade ");

            } else {

                System.out.println(numero + " Não tem a propriedade ");

            }

        }else {

            System.out.print(" Número informado deve conter 3 dígitos ");

        }

        key.close();

    }

}
