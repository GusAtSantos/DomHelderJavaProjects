package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex08 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int faltas, qtdAlunos, aprovados, muitasFaltas;
        double notaFinal, somaNotasAprovados, mediaAprovados;

        qtdAlunos = 50;
        aprovados = 0;
        muitasFaltas = 0;
        somaNotasAprovados = 0;

        for (int aux = 1; aux <= qtdAlunos; aux++) {
            System.out.print("Nota final: ");
            notaFinal = key.nextDouble();

            System.out.print("Total de faltas: ");
            faltas = key.nextInt();

            if (notaFinal >= 65 && faltas <= 16) {
                System.out.println("ALUNO APROVADO");
                aprovados++;
                somaNotasAprovados += notaFinal;
            } else {
                System.out.println("ALUNO REPROVADO");
            }

            if (faltas > 16) {
                muitasFaltas++;
            }
        }

        if (aprovados > 0) {
            mediaAprovados = somaNotasAprovados / aprovados;
            System.out.println("Média das notas dos aprovados = " + mediaAprovados);
        } else {
            System.out.println("Nenhum aluno foi aprovado.");
        }

        System.out.println("Quantidade de alunos com mais de 16 faltas = " + muitasFaltas);

        key.close();
    }
}
