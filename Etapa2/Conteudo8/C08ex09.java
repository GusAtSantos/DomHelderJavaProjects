package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex09 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String nome, sexo;
        int qtdPessoas, idade;
        int somaIdadeHomens, somaIdadeMulheres, contHomens, contMulheres;
        double mediaHomens, mediaMulheres;

        somaIdadeHomens = 0;
        somaIdadeMulheres = 0;
        contHomens = 0;
        contMulheres = 0;

        System.out.print("Quantas pessoas serão informadas? ");
        qtdPessoas = key.nextInt();
        key.nextLine();

        for (int aux = 1; aux <= qtdPessoas; aux++) {
            System.out.print("Nome: ");
            nome = key.nextLine();

            System.out.print("Idade: ");
            idade = key.nextInt();
            key.nextLine();

            System.out.print("Sexo (M ou F): ");
            sexo = key.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                somaIdadeMulheres += idade;
                contMulheres++;
            } else {
                somaIdadeHomens += idade;
                contHomens++;
            }
        }

        if (contHomens > 0) {
            mediaHomens = (double) somaIdadeHomens / contHomens;
            System.out.println("Média das idades dos homens = " + mediaHomens);
        } else {
            System.out.println("Nenhum homem informado.");
        }

        if (contMulheres > 0) {
            mediaMulheres = (double) somaIdadeMulheres / contMulheres;
            System.out.println("Média das idades das mulheres = " + mediaMulheres);
        } else {
            System.out.println("Nenhuma mulher informada.");
        }

        key.close();
    }

}
