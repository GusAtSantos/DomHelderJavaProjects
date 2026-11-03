package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex05 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nome;
        int codigo, total, ingles;
        double mensalidade, somaGeral, somaIngles, somaFrances, somaEspanhol, mediaGeral;

        total = 0;
        ingles = 0;
        somaGeral = 0;
        somaIngles = 0;
        somaFrances = 0;
        somaEspanhol = 0;

        System.out.print("Nome do aluno (FIM para encerrar): ");
        nome = key.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Código da opção (1-Inglês, 2-Francês, 3-Espanhol): ");
            codigo = Integer.parseInt(key.nextLine());

            switch (codigo) {
                case 1:
                    mensalidade = 100.00;
                    ingles++;
                    somaIngles += mensalidade;
                    break;
                case 2:
                    mensalidade = 150.00;
                    somaFrances += mensalidade;
                    break;
                case 3:
                    mensalidade = 120.00;
                    somaEspanhol += mensalidade;
                    break;
                default:
                    mensalidade = 0;
            }

            if (mensalidade == 0) {
                System.out.println("Código inválido! Aluno ignorado.");
            } else {
                System.out.printf("%s - Mensalidade = R$ %.2f%n", nome, mensalidade);
                total++;
                somaGeral += mensalidade;
            }

            System.out.print("Nome do aluno (FIM para encerrar): ");
            nome = key.nextLine();
        }

        System.out.println("Alunos matriculados em Inglês = " + ingles);
        if (total > 0) {
            mediaGeral = somaGeral / total;
            System.out.printf("Mensalidade média da escola = R$ %.2f%n", mediaGeral);
        }
        System.out.printf("Total das mensalidades de Inglês = R$ %.2f%n", somaIngles);
        System.out.printf("Total das mensalidades de Francês = R$ %.2f%n", somaFrances);
        System.out.printf("Total das mensalidades de Espanhol = R$ %.2f%n", somaEspanhol);

        key.close();
    }
}
