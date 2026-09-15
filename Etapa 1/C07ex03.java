package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C07ex03 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double imposto, percentualMulta, multa;
        int dias;

        System.out.print("Valor do imposto: ");
        imposto = key.nextDouble();

        System.out.print("Dias de atraso: ");
        dias = key.nextInt();

        if (dias <= 5) {
            percentualMulta = 0;
        } else if (dias <= 8) {
            percentualMulta = 0.02;
        } else if (dias <= 10) {
            percentualMulta = 0.10 + (0.005 * dias);
        } else {
            percentualMulta = 1.50 + (dias * 1.00 / imposto);
        }

        multa = imposto * percentualMulta;

        System.out.printf("Multa = R$%.2f%n", multa);

        key.close();
    }

}
