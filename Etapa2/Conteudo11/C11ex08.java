package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex08 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nome, funcao, nomeMaior, funcaoMaior;
        int horas, total, somaHoras, faixa1, faixa2, faixa3;
        double valorHora, premio, salario, maiorSalario, folha, mediaHoras;

        total = 0;
        somaHoras = 0;
        faixa1 = 0;
        faixa2 = 0;
        faixa3 = 0;
        folha = 0;
        maiorSalario = 0;
        nomeMaior = "";
        funcaoMaior = "";

        System.out.print("Valor da hora trabalhada: ");
        valorHora = Double.parseDouble(key.nextLine().replace(',', '.'));

        System.out.print("Nome do trabalhador (FIM para encerrar): ");
        nome = key.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Função: ");
            funcao = key.nextLine();
            System.out.print("Horas trabalhadas: ");
            horas = Integer.parseInt(key.nextLine());

            if (horas <= 100) {
                premio = 1000;
                faixa1++;
            } else if (horas <= 500) {
                premio = 10.0 * horas;
                faixa2++;
            } else {
                premio = 100.0 * (horas / 10);
                faixa3++;
            }

            salario = horas * valorHora + premio;
            System.out.printf("%s receberá R$ %.2f%n", nome, salario);

            total++;
            somaHoras += horas;
            folha += salario;
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                funcaoMaior = funcao;
            }

            System.out.print("Nome do trabalhador (FIM para encerrar): ");
            nome = key.nextLine();
        }

        if (total > 0) {
            mediaHoras = (double) somaHoras / total;
            System.out.printf("Média de horas trabalhadas = %.2f%n", mediaHoras);
            System.out.println("Maior salário: " + nomeMaior + " (" + funcaoMaior + ")");
            System.out.println("Pessoas na faixa até 100 horas = " + faixa1);
            System.out.println("Pessoas na faixa de 101 a 500 horas = " + faixa2);
            System.out.println("Pessoas na faixa acima de 500 horas = " + faixa3);
            System.out.printf("Valor total da folha de pagamento = R$ %.2f%n", folha);
        } else {
            System.out.println("Nenhum trabalhador foi informado.");
        }

        key.close();
    }
}
