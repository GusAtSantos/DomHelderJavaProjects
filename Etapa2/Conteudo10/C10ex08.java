package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C10ex08 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nome, nomeMenor;
        int populacao, eleitores, homens, mulheres, menorPopulacao;
        int totalCidades, populacaoTotal, eleitoresTotal, homensTotal, maisMulheres;
        double percentualEleitores, mediaHomens;

        totalCidades = 0;
        populacaoTotal = 0;
        eleitoresTotal = 0;
        homensTotal = 0;
        maisMulheres = 0;
        menorPopulacao = Integer.MAX_VALUE;
        nomeMenor = "";

        do {
            System.out.print("Nome da cidade: ");
            nome = key.nextLine();
            System.out.print("População: ");
            populacao = Integer.parseInt(key.nextLine());
            System.out.print("Eleitores: ");
            eleitores = Integer.parseInt(key.nextLine());
            System.out.print("Homens: ");
            homens = Integer.parseInt(key.nextLine());
            System.out.print("Mulheres: ");
            mulheres = Integer.parseInt(key.nextLine());

            if (homens + mulheres != populacao) {
                System.out.println("Atenção: em " + nome + ", homens + mulheres é diferente da população!");
            }

            totalCidades++;
            populacaoTotal += populacao;
            eleitoresTotal += eleitores;
            homensTotal += homens;
            if (mulheres > homens) {
                maisMulheres++;
            }
            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                nomeMenor = nome;
            }
        } while (!nome.equalsIgnoreCase("Zimbabue de Minas"));

        percentualEleitores = (double) eleitoresTotal / populacaoTotal * 100;
        mediaHomens = (double) homensTotal / totalCidades;

        System.out.println("Total de cidades = " + totalCidades);
        System.out.println("População total = " + populacaoTotal);
        System.out.println("Percentual de eleitores = " + percentualEleitores + "%");
        System.out.println("Cidades com mais mulheres que homens = " + maisMulheres);
        System.out.println("Média de homens = " + mediaHomens);
        System.out.println("Cidade com menor população = " + nomeMenor);

        key.close();
    }
}