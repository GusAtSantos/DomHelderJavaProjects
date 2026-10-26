package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex13 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String cidade, cidadeMenorPop;
        int qtdCidades, populacao, eleitores, homens, mulheres;
        int contMilhao, contMaisMulheres, menorPop;
        double percEleitores;

        qtdCidades = 858;
        contMilhao = 0;
        contMaisMulheres = 0;
        menorPop = 0;
        cidadeMenorPop = "";

        for (int aux = 1; aux <= qtdCidades; aux++) {
            System.out.print("Cidade: ");
            cidade = key.nextLine();

            System.out.print("População: ");
            populacao = key.nextInt();
            System.out.print("Eleitores: ");
            eleitores = key.nextInt();
            System.out.print("Homens: ");
            homens = key.nextInt();
            System.out.print("Mulheres: ");
            mulheres = key.nextInt();
            key.nextLine();

            if (homens + mulheres != populacao) {
                System.out.println(cidade + ": a soma de homens e mulheres difere da população!");
            }

            percEleitores = (double) eleitores / populacao * 100;
            System.out.printf("%s: %.1f%% de eleitores%n", cidade, percEleitores);

            if (populacao > 1000000) {
                contMilhao++;
            }

            if (mulheres > homens) {
                contMaisMulheres++;
            }

            if (aux == 1 || populacao < menorPop) {
                menorPop = populacao;
                cidadeMenorPop = cidade;
            }
        }

        System.out.println("Total de cidades com mais de 1 milhão de habitantes = " + contMilhao);
        System.out.println("Cidades com mais mulheres que homens = " + contMaisMulheres);
        System.out.println("Cidade com menor população = " + cidadeMenorPop);

        key.close();
    }

}
