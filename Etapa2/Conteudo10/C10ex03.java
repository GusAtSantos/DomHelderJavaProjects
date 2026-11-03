package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C10ex03 {

    static void main() {

        Scanner key = new Scanner(System.in);
        final double PI = 3.1416;
        double alfa, raio, area;

        System.out.print("Informe o ângulo (α): ");
        alfa = key.nextDouble();

        do {
            System.out.print("Informe o raio R (-1 para encerrar): ");
            raio = key.nextDouble();

            if (raio != -1) {
                area = (alfa * PI * Math.pow(raio, 2)) / 360;
                System.out.println("S = " + area);
            }
        } while (raio != -1);

        key.close();

    }

}
