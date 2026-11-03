package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex06 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        final int CASAS = 100;
        int i, canal, pessoas, audiencia4, audiencia7, audiencia12, audienciaTotal, casasValidas, maisAssistido;
        double mediaPessoas;

        audiencia4 = 0;
        audiencia7 = 0;
        audiencia12 = 0;
        casasValidas = 0;

        i = 1;
        while (i <= CASAS) {
            System.out.print("Casa " + i + " - canal (0 se a TV estiver desligada): ");
            canal = key.nextInt();

            if (canal == 4 || canal == 7 || canal == 12) {
                System.out.print("Pessoas assistindo: ");
                pessoas = key.nextInt();

                if (canal == 4) {
                    audiencia4 += pessoas;
                } else if (canal == 7) {
                    audiencia7 += pessoas;
                } else {
                    audiencia12 += pessoas;
                }
                casasValidas++;
            }
            i++;
        }

        audienciaTotal = audiencia4 + audiencia7 + audiencia12;

        System.out.println("Audiência do canal 4 = " + audiencia4);
        System.out.println("Audiência do canal 7 = " + audiencia7);
        System.out.println("Audiência do canal 12 = " + audiencia12);

        if (audienciaTotal > 0) {
            System.out.printf("Canal 4 = %.2f%%%n", (double) audiencia4 / audienciaTotal * 100);
            System.out.printf("Canal 7 = %.2f%%%n", (double) audiencia7 / audienciaTotal * 100);
            System.out.printf("Canal 12 = %.2f%%%n", (double) audiencia12 / audienciaTotal * 100);

            maisAssistido = 4;
            if (audiencia7 > audiencia4 && audiencia7 >= audiencia12) {
                maisAssistido = 7;
            } else if (audiencia12 > audiencia4 && audiencia12 > audiencia7) {
                maisAssistido = 12;
            }
            System.out.println("Canal mais assistido = " + maisAssistido);

            mediaPessoas = (double) audienciaTotal / casasValidas;
            System.out.printf("Média de pessoas assistindo TV = %.2f%n", mediaPessoas);
        } else {
            System.out.println("Nenhuma casa com TV ligada nos canais pesquisados.");
        }

        key.close();
    }
}