package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex02 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double notaFinal;
        int faltas;

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Nota final: ");
            notaFinal = key.nextDouble();

            if (notaFinal == -1) {
                break;
            }

            System.out.print("Total de faltas: ");
            faltas = key.nextInt();

            if (notaFinal >= 65 && faltas <= 16) {
                System.out.println("ALUNO APROVADO");
            } else {
                System.out.println("ALUNO REPROVADO");
            }
        }

        key.close();
    }
}
