package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex02a {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        final int CLIENTES = 538;
        String nome, classificacao, nomeMenor;
        double valor, menorValor, volumeTotal, somaBronze, mediaBronze;
        int i, bronze, prata, ouro;

        bronze = 0;
        prata = 0;
        ouro = 0;
        somaBronze = 0;
        volumeTotal = 0;
        menorValor = Double.MAX_VALUE;
        nomeMenor = "";

        i = 1;
        while (i <= CLIENTES) {
            System.out.print("Nome do cliente " + i + ": ");
            nome = key.nextLine();
            System.out.print("Valor aplicado: ");
            valor = Double.parseDouble(key.nextLine().replace(',', '.'));

            if (valor <= 1000) {
                classificacao = "Bronze";
                bronze++;
                somaBronze += valor;
            } else if (valor <= 5000) {
                classificacao = "Prata";
                prata++;
            } else {
                classificacao = "Ouro";
                ouro++;
            }
            System.out.println(nome + " - " + classificacao);

            volumeTotal += valor;
            if (valor < menorValor) {
                menorValor = valor;
                nomeMenor = nome;
            }
            i++;
        }

        System.out.println("Total de Bronze = " + bronze);
        System.out.println("Total de Prata = " + prata);
        System.out.println("Total de Ouro = " + ouro);
        if (bronze > 0) {
            mediaBronze = somaBronze / bronze;
            System.out.printf("Média das aplicações dos clientes Bronze = R$ %.2f%n", mediaBronze);
        }
        System.out.printf("Volume total das aplicações = R$ %.2f%n", volumeTotal);
        System.out.println("Nome do aplicador de menor aplicação = " + nomeMenor);

        key.close();
    }
}