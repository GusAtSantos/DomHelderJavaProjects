package Etapa2.Conteudo8;

//Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C08ex21 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double altura, imc;
        String situacao;

        System.out.print("Digite sua altura em metros: ");
        altura = key.nextDouble();

        System.out.println("Peso\tIMC\t\tSituação Corpórea");

        for (int aux = 60; aux <= 100; aux++) {
            imc = aux / Math.pow(altura, 2);

            if (imc < 20) {
                situacao = "ABAIXO DO PESO";
            } else if (imc <= 25) {
                situacao = "PESO IDEAL";
            } else {
                situacao = "ACIMA DO PESO";
            }

            System.out.println(aux + "\t" + imc + "\t" + situacao);
        }

        key.close();

    }

}
