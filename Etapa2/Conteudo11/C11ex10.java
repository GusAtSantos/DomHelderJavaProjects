package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex10 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Informe um número entre 1 e 9: ");
            numero = key.nextInt();
        } while (numero < 1 || numero > 9);

        for (int linha = 1; linha <= numero; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("DH");
                if (coluna < linha) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        key.close();
    }
}