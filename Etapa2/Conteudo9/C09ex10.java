package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C09ex10 {

    static void main() {

        Scanner key = new Scanner(System.in);

        String opcao;

        double num, den, serie;

        System.out.print("Escolha a série (A, B, C, D, E ou F): ");
        opcao = key.next().toUpperCase();

        serie = 0;

        switch (opcao) {
            case "A":
                // 1/√2 + 2/√4 + 3/√6 + ...
                for (int aux = 1; aux <= 100; aux++) {
                    num = aux;
                    den = Math.sqrt(2 * aux);
                    serie += num / den;
                }
                System.out.println("Série A = " + serie);
                break;

            case "B":
                // 1 + √(2/3 + 4/6 + 6/9 + ...)
                for (int aux = 1; aux <= 100; aux++) {
                    num = 2 * aux;
                    den = 3 * aux;
                    serie += num / den;
                }
                serie = 1 + Math.sqrt(serie);
                System.out.println("Série B = " + serie);
                break;

            case "C":
                // (1/3) * (1/2 + 3/4 + 5/6 + ...)²
                for (int aux = 1; aux <= 100; aux++) {
                    num = 2 * aux - 1;
                    den = 2 * aux;
                    serie += num / den;
                }
                serie = (1.0 / 3.0) * Math.pow(serie, 2);
                System.out.println("Série C = " + serie);
                break;

            case "D":
                // (1+0)/1 + (2+1)/4 + (3+2)/9 + ...
                for (int aux = 1; aux <= 100; aux++) {
                    num = aux + (aux - 1);
                    den = Math.pow(aux, 2);
                    serie += num / den;
                }
                System.out.println("Série D = " + serie);
                break;

            case "E":
                // 1/(3×2) + 2/(3×4) + 3/(3×6) + ...
                for (int aux = 1; aux <= 100; aux++) {
                    num = aux;
                    den = 3 * (2 * aux);
                    serie += num / den;
                }
                System.out.println("Série E = " + serie);
                break;

            case "F":
                // 1/2² + 4/4² + 9/6² + ...
                for (int aux = 1; aux <= 100; aux++) {
                    num = Math.pow(aux, 2);
                    den = Math.pow(2 * aux, 2);
                    serie += num / den;
                }
                System.out.println("Série F = " + serie);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        key.close();

    }

}
