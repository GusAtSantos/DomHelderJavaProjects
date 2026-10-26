package Etapa2.Conteudo9;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C09ex11 {

    static void main() {

        Scanner key = new Scanner(System.in);
        String opcao;
        double num, den, serie;

        System.out.print("Escolha a série (A, B, C, D, E ou F): ");
        opcao = key.next().toUpperCase();

        serie = 0;

        switch (opcao) {
            case "A":
                // ∛( (1+1)/1 + (2+8)/4 + (3+15)/16 + (4+22)/64 + ... )
                for (int aux = 1; aux <= 100; aux++) {
                    num = aux + (7 * aux - 6);
                    den = Math.pow(4, aux - 1);
                    serie += num / den;
                }
                serie = Math.cbrt(serie);
                System.out.println("Série A = " + serie);
                break;

            case "B":
                // (5/3) * ( 1/√7 + 4/√10 + 7/√13 + ... )
                for (int aux = 1; aux <= 100; aux++) {
                    num = 3 * aux - 2;
                    den = Math.sqrt(3 * aux + 4);
                    serie += num / den;
                }
                serie = (5.0 / 3.0) * serie;
                System.out.println("Série B = " + serie);
                break;

            case "C":
                // ( 3√5/5 + 5√9/25 + 7√13/125 + ... )²
                for (int aux = 1; aux <= 100; aux++) {
                    num = (2 * aux + 1) * Math.sqrt(4 * aux + 1);
                    den = Math.pow(5, aux);
                    serie += num / den;
                }
                serie = Math.pow(serie, 2);
                System.out.println("Série C = " + serie);
                break;

            case "D":
                // 1/1 + 8/10 + 27/100 + 64/1000 + ...
                for (int aux = 1; aux <= 100; aux++) {
                    num = Math.pow(aux, 3);
                    den = Math.pow(10, aux - 1);
                    serie += num / den;
                }
                System.out.println("Série D = " + serie);
                break;

            case "E":
                // (2/3) * ( 1√5/2¹ + 4√7/3² + 9√9/4³ + ... )
                for (int aux = 1; aux <= 100; aux++) {
                    num = Math.pow(aux, 2) * Math.sqrt(2 * aux + 3);
                    den = Math.pow(aux + 1, aux);
                    serie += num / den;
                }
                serie = (2.0 / 3.0) * serie;
                System.out.println("Série E = " + serie);
                break;

            case "F":
                // 5 * √( 1×4/2² + 3×8/7² + 5×16/12² + ... )
                for (int aux = 1; aux <= 100; aux++) {
                    num = (2 * aux - 1) * Math.pow(2, aux + 1);
                    den = Math.pow(5 * aux - 3, 2);
                    serie += num / den;
                }
                serie = 5 * Math.sqrt(serie);
                System.out.println("Série F = " + serie);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        key.close();

    }

}
