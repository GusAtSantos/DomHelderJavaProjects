package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C10ex01 {

    static void main() {

        Scanner key = new Scanner(System.in);
        double valor, multa, somaMultas, media;
        int cont;

        somaMultas = 0;
        cont = 0;

        do {
            System.out.print("Informe o valor (-1 para encerrar): ");
            valor = key.nextDouble();

            if (valor != -1) {
                multa = valor * 0.10;
                System.out.printf("Multa = %.2f%n", multa);
                somaMultas += multa;
                cont++;
            }
        } while (valor != -1);

        if (cont > 0) {
            media = somaMultas / cont;
            System.out.printf("Média = %.2f%n", media);
        } else {
            System.out.println("Nenhum valor foi informado.");
        }

        key.close();

    }

}
