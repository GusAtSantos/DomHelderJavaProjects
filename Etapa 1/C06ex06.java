package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex06 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double  a, b, c, delta, raiz, raiz1,raiz2;

        System.out.print("Digite A: ");
         a = key.nextDouble();
        System.out.print("Digite B: ");
         b = key.nextDouble();
        System.out.print("Digite C: ");
         c = key.nextDouble();

         delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
             raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
             raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Duas raízes: %.2f e %.2f%n", raiz1, raiz2);
        } else if (delta == 0) {
             raiz = -b / (2 * a);
            System.out.printf("Uma raiz: %.2f%n", raiz);
        } else {
            System.out.println("Não tem raízes reais.");
        }

        key.close();
    }

}
