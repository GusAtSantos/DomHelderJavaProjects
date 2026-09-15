package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex10 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double capital, taxaDiaria, taxaDecimal, rendimento, impostoRenda, taxaAdministracao,valorResgatado;
        int dias;

        System.out.print("Digite o capital aplicado: ");
         capital = key.nextDouble();

        System.out.print("Digite o número de dias: ");
         dias = key.nextInt();

        System.out.print("Digite a taxa diária (em %): ");
         taxaDiaria = key.nextDouble();

         taxaDecimal = taxaDiaria / 100;

         rendimento = capital * taxaDecimal * dias;
         impostoRenda = 0.15 * rendimento;
         taxaAdministracao = 10.00;

         valorResgatado = capital + rendimento - impostoRenda - taxaAdministracao;

        System.out.printf("Rendimento = R$%.2f%n", rendimento);
        System.out.printf("Imposto de Renda = R$%.2f%n", impostoRenda);
        System.out.printf("Valor Resgatado = R$%.2f%n", valorResgatado);

        key.close();
    }

}
