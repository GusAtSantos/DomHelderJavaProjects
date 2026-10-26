package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C08ex29 {

    static void main() {

        Scanner key = new Scanner(System.in);

        int x, y;
        long resultado;

        resultado = 1;

        System.out.print("Digite X (base): ");
        x = key.nextInt();

        System.out.print("Digite Y (expoente): ");
        y = key.nextInt();

        for (int aux = 1; aux <= y; aux++) {
            resultado *= x;
        }

        System.out.println(x + " elevado a " + y + " = " + resultado);

        key.close();
    }
}
