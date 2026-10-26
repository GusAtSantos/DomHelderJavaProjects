package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex01 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        final double PI = 3.1416;
        double raio, area;

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Digite o raio do círculo: ");
            raio = key.nextDouble();

            area = PI * Math.pow(raio, 2);

            System.out.printf("Área = %.4f%n", area);
        }

        key.close();
    }
}
