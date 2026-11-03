package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex12 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Informe um número entre 1 e 9: ");
            numero = key.nextInt();
        } while (numero < 1 || numero > 9);

        for (int linha = 1; linha <= numero; linha++) {
            for (int crescente = 1; crescente <= linha; crescente++) {
                System.out.print(crescente);
            }
            for (int decrescente = linha; decrescente >= 1; decrescente--) {
                System.out.print(decrescente);
            }
            System.out.println();
        }

        key.close();
    }
}
