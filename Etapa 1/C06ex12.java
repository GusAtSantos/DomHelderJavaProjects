package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex12 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int producao,defeituosas,meses,bolasBoas,caixas,galpoes ;

        double precoCaixa,aluguelMensal ;

        System.out.print("Quantidade de bolas produzidas: ");
         producao = key.nextInt();

        System.out.print("Bolas com defeito: ");
         defeituosas = key.nextInt();

        System.out.print("Preço da caixa de papelão: ");
         precoCaixa = key.nextDouble();

        System.out.print("Aluguel mensal: ");
         aluguelMensal = key.nextDouble();

        System.out.print("Meses até a Copa: ");
         meses = key.nextInt();

         bolasBoas = producao - defeituosas;

         caixas = (bolasBoas + 9) / 10;
         galpoes = (caixas + 849) / 850;

        double custoEmbalagem = caixas * precoCaixa;
        double custoEstocagem = galpoes * aluguelMensal * meses;

        double custoTotal = custoEmbalagem + custoEstocagem;

        System.out.printf("Custo Total = R$%.2f%n", custoTotal);

        key.close();

    }

}
