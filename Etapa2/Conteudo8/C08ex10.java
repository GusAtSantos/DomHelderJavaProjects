package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex10 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String nome, nomeMaior;
        int qtdInsumos, quantidade;
        double precoUnitario, custoParcial, custoTotal, maiorCusto, mediaCustos;

        custoTotal = 0;
        maiorCusto = 0;
        nomeMaior = "";

        System.out.print("Quantos insumos foram utilizados? ");
        qtdInsumos = key.nextInt();
        key.nextLine();

        for (int aux = 1; aux <= qtdInsumos; aux++) {
            System.out.print("Nome do insumo: ");
            nome = key.nextLine();

            System.out.print("Quantidade consumida: ");
            quantidade = key.nextInt();

            System.out.print("Preço unitário: R$ ");
            precoUnitario = key.nextDouble();
            key.nextLine();

            custoParcial = quantidade * precoUnitario;
            custoTotal += custoParcial;

            if (aux == 1 || custoParcial > maiorCusto) {
                maiorCusto = custoParcial;
                nomeMaior = nome;
            }
        }

        mediaCustos = custoTotal / qtdInsumos;

        System.out.printf("Custo total do projeto = R$%.2f%n", custoTotal);
        System.out.printf("Média dos custos parciais = R$%.2f%n", mediaCustos);
        System.out.println("Insumo de maior custo parcial = " + nomeMaior);

        key.close();
    }

}
