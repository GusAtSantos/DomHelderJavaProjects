package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex04 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print(" Digite a sua altura :  ");
        altura = key.nextDouble();

        System.out.print(" Digite seu peso :  ");
        peso = key.nextDouble();

        imc = peso / Math.pow(altura,2);

        if ( imc < 18){
            System.out.printf(" Você esta desnutrido, seu IMC = %.2f%n " , imc);
        }else if (imc < 20){
            System.out.printf(" Você esta abaixo do peso, seu IMC = %.2f%n " , imc);
        } else if (imc > 20 && imc < 25) {
            System.out.printf(" Você esta no peso ideal, seu IMC = %.2f%n " , imc);
        }else if (imc > 25){
            System.out.printf(" Você esta acima do peso ideal, seu IMC = %.2f%n " , imc);
        } else if (imc > 27) {
            System.out.printf(" Você esta obeso, seu IMC = %.2f%n " , imc);
        }


        key.close();

    }

}
