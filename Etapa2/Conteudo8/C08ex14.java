package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex14 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int n;
        String simbolo;

        System.out.print("Digite um número de 1 a 20: ");
        n = key.nextInt();

        System.out.print("Digite um símbolo: ");
        simbolo = key.next();

        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= n; coluna++) {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }

        key.close();
    }

}
