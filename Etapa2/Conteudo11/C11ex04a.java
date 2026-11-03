package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex04a {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        final int MULTAS = 230;
        String nome, sexo, nomeVelho;
        int i, idade, pontos, somaIdades, homens, mulheres7, idadeVelho;
        double valor, totalMultas, mediaIdade, percentualHomens;

        somaIdades = 0;
        homens = 0;
        mulheres7 = 0;
        totalMultas = 0;
        idadeVelho = 0;
        nomeVelho = "";

        i = 1;
        while (i <= MULTAS) {
            System.out.print("Nome do condutor " + i + ": ");
            nome = key.nextLine();
            System.out.print("Idade: ");
            idade = Integer.parseInt(key.nextLine());
            System.out.print("Sexo (M ou F): ");
            sexo = key.nextLine();
            System.out.print("Pontos perdidos: ");
            pontos = Integer.parseInt(key.nextLine());
            System.out.print("Valor da multa: ");
            valor = Double.parseDouble(key.nextLine().replace(',', '.'));

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
            i++;
        }

        mediaIdade = (double) somaIdades / MULTAS;
        percentualHomens = (double) homens / MULTAS * 100;

        System.out.printf("Idade média dos condutores = %.2f%n", mediaIdade);
        System.out.printf("Valor total das multas = R$ %.2f%n", totalMultas);
        System.out.printf("Percentual de homens multados = %.2f%%%n", percentualHomens);
        System.out.println("Mulheres que perderam 7 pontos = " + mulheres7);
        System.out.println("Pessoa mais velha = " + nomeVelho + ", " + idadeVelho + " anos");

        key.close();
    }
}
