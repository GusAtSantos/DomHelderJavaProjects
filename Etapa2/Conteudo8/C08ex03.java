package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex03 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double notaFinal;
        int faltas, aprovados, reprovados;

        aprovados = 0;
        reprovados = 0;

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Nota final: ");
            notaFinal = key.nextDouble();

            System.out.print("Total de faltas: ");
            faltas = key.nextInt();

            if (notaFinal >= 65 && faltas <= 16) {
                System.out.println("ALUNO APROVADO");
                aprovados++;
            } else {
                System.out.println("ALUNO REPROVADO");
                reprovados++;
            }
        }

        System.out.println("Aprovados = " + aprovados);
        System.out.println("Reprovados = " + reprovados);

        key.close();
    }
}
