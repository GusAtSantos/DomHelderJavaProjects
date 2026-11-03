package Etapa2.Conteudo10;
/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C10ex06 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double a, b, c, xo, yo, distancia;

        System.out.print("Informe A, B e C da reta: ");
        a = key.nextDouble();
        b = key.nextDouble();
        c = key.nextDouble();

        do {
            System.out.print("Informe Xo e Yo do ponto P: ");
            xo = key.nextDouble();
            yo = key.nextDouble();

            distancia = Math.abs(a * xo + b * yo + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("D = " + distancia);
        } while (distancia != 0);

        System.out.println("Ponto coincidente com a reta: Xo = " + xo + " e Yo = " + yo);

        key.close();
    }
}