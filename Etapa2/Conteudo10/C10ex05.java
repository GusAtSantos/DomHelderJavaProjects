package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C10ex05 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String sexo;
        int total, mulheres, homens, mulheresLeves;
        double altura, peso, somaAlturaHomens, mediaHomens;

        total = 0;
        mulheres = 0;
        homens = 0;
        mulheresLeves = 0;
        somaAlturaHomens = 0;

        do {
            System.out.print("Altura em m (0 para encerrar): ");
            altura = key.nextDouble();

            if (altura != 0) {
                System.out.print("Peso em kg: ");
                peso = key.nextDouble();
                System.out.print("Sexo (M ou F): ");
                sexo = key.next();

                total++;
                if (sexo.equalsIgnoreCase("F")) {
                    mulheres++;
                    if (peso < 60) {
                        mulheresLeves++;
                    }
                } else {
                    homens++;
                    somaAlturaHomens += altura;
                }
            }
        } while (altura != 0);

        System.out.println("Total de pessoas pesquisadas = " + total);
        System.out.println("Quantidade de mulheres = " + mulheres);
        if (homens > 0) {
            mediaHomens = somaAlturaHomens / homens;
            System.out.println("Altura média dos homens = " + mediaHomens);
        } else {
            System.out.println("Altura média dos homens = nenhum homem informado");
        }
        System.out.println("Quantidade de mulheres com peso inferior a 60 = " + mulheresLeves);

        key.close();
    }
}