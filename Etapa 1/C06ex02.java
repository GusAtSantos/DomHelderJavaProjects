package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex02 {

    static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double poluentes, multa;

        System.out.print(" Digite a quantidade de poluentes : ");
        poluentes = key.nextDouble();

        if (poluentes <= 1500){
            multa = 0;
        } else if (poluentes <= 3500){
            multa = 3000;
        }else {
            multa = 5000 * poluentes;
        }

        System.out.printf(" Multa = %.2f%n " , multa);

        key.close();

    }

}
