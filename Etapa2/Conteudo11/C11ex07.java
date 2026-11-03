package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex07 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        final int DIAS = 121;
        int i, diasMaior;
        double temperatura, menor, maior, soma, media;

        soma = 0;
        diasMaior = 0;
        menor = Double.MAX_VALUE;
        maior = -Double.MAX_VALUE;

        i = 1;
        while (i <= DIAS) {
            System.out.print("Temperatura do dia " + i + ": ");
            temperatura = Double.parseDouble(key.nextLine().replace(',', '.'));

            soma += temperatura;
            if (temperatura < menor) {
                menor = temperatura;
            }
            if (temperatura > maior) {
                maior = temperatura;
                diasMaior = 1;
            } else if (temperatura == maior) {
                diasMaior++;
            }
            i++;
        }

        media = soma / DIAS;

        System.out.println("Menor temperatura = " + menor);
        System.out.println("Maior temperatura = " + maior);
        System.out.printf("Média das temperaturas = %.2f%n", media);
        System.out.println("Dias com a maior temperatura = " + diasMaior);

        key.close();
    }
}
