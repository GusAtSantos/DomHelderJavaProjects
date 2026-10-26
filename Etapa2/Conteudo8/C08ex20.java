package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex20 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int n;
        double termo, soma;

        soma = 0;

        System.out.print("Quantos termos? ");
        n = key.nextInt();

        for (int aux = 1; aux <= n; aux++) {
            termo = Math.pow(2, aux - 1);
            System.out.printf("%.0f%n", termo);
            soma += termo;
        }

        System.out.printf("Soma dos %d primeiros termos: %.0f%n", n, soma);

        key.close();
    }

}
