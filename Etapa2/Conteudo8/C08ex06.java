package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex06 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int numero, somaDiv4, contDiv3;

        somaDiv4 = 0;
        contDiv3 = 0;

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Digite um número inteiro: ");
            numero = key.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é PAR");
            } else {
                System.out.println(numero + " é ÍMPAR");
            }

            if (numero % 4 == 0) {
                somaDiv4 += numero;
            }

            if (numero % 3 == 0) {
                contDiv3++;
            }
        }

        System.out.println("Soma dos números divisíveis por 4 = " + somaDiv4);
        System.out.println("Quantidade de números divisíveis por 3 = " + contDiv3);

        key.close();
    }
}
