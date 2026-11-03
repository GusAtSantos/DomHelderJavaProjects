package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex04b {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nome, sexo, nomeVelho;
        int total, idade, pontos, somaIdades, homens, mulheres7, idadeVelho;
        double valor, totalMultas, mediaIdade, percentualHomens;

        total = 0;
        somaIdades = 0;
        homens = 0;
        mulheres7 = 0;
        totalMultas = 0;
        idadeVelho = 0;
        nomeVelho = "";

        System.out.print("Nome do condutor (X para encerrar): ");
        nome = key.nextLine();

        while (!nome.equalsIgnoreCase("X")) {
            System.out.print("Idade: ");
            idade = Integer.parseInt(key.nextLine());
            System.out.print("Sexo (M ou F): ");
            sexo = key.nextLine();
            System.out.print("Pontos perdidos: ");
            pontos = Integer.parseInt(key.nextLine());
            System.out.print("Valor da multa: ");
            valor = Double.parseDouble(key.nextLine().replace(',', '.'));

            total++;
            somaIdades += idade;
            totalMultas += valor;
            if (sexo.equalsIgnoreCase("M")) {
                homens++;
            } else if (pontos == 7) {
                mulheres7++;
            }
            if (idade > idadeVelho) {
                idadeVelho = idade;
                nomeVelho = nome;
            }

            System.out.print("Nome do condutor (X para encerrar): ");
            nome = key.nextLine();
        }

        if (total > 0) {
            mediaIdade = (double) somaIdades / total;
            percentualHomens = (double) homens / total * 100;

            System.out.printf("Idade média dos condutores = %.2f%n", mediaIdade);
            System.out.printf("Valor total das multas = R$ %.2f%n", totalMultas);
            System.out.printf("Percentual de homens multados = %.2f%%%n", percentualHomens);
            System.out.println("Mulheres que perderam 7 pontos = " + mulheres7);
            System.out.println("Pessoa mais velha = " + nomeVelho + ", " + idadeVelho + " anos");
        } else {
            System.out.println("Nenhuma multa foi informada.");
        }

        key.close();
    }
}