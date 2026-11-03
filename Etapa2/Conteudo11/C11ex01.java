package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex01 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int limite, x, cont;
        double fx, soma, media;

        soma = 0;
        cont = 0;

        System.out.print("Informe o número limite: ");
        limite = key.nextInt();

        x = 1;
        while (x <= limite) {
            fx = Math.pow(x, 2) + (4.0 * x - 2) / 5;
            System.out.println("x=" + x + "  f(x)=" + fx);
            soma += fx;
            cont++;
            x += 2;
        }

        if (cont > 0) {
            media = soma / cont;
            System.out.println("Média de f(x) = " + media);
        }

        key.close();
    }
}