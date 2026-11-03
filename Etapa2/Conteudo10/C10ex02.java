package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C10ex02 {

    static void main() {

        Scanner key = new Scanner(System.in);
        double valor, total, media;
        int cont, acima;

        total = 0;
        cont = 0;
        acima = 0;

        do {
            System.out.print("Informe o valor recebido (0 para encerrar): ");
            valor = key.nextDouble();

            if (valor != 0) {
                total += valor;
                cont++;
                if (valor > 1000) {
                    acima++;
                }
            }
        } while (valor != 0);

        if (cont > 0) {
            media = total / cont;
            System.out.printf("Valor total recebido = %.2f%n", total);
            System.out.printf("Média dos valores recebidos = %.2f%n", media);
            System.out.println("Quantidade de valores acima de R$1000.00 = " + acima);
        } else {
            System.out.println("Nenhum valor foi informado.");
        }

        key.close();

    }

}
