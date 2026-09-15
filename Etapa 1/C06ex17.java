package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex17 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String resp1, resp2, resp3, resp4, resp5, resp6, resp7, resp8, resp9;
        boolean p1, p2, p3, p4, p5, p6, p7, p8, p9;
        boolean apto;

        System.out.print("1) Curso técnico de programação? (V/F): ");
        resp1 = key.next();
        System.out.print("2) Curso superior de programação? (V/F): ");
        resp2 = key.next();
        System.out.print("3) Menos de 3 anos de experiência? (V/F): ");
        resp3 = key.next();
        System.out.print("4) Pessoa criativa? (V/F): ");
        resp4 = key.next();
        System.out.print("5) Prefere liderar a ser liderado? (V/F): ");
        resp5 = key.next();
        System.out.print("6) Prefere trabalhar sozinho? (V/F): ");
        resp6 = key.next();
        System.out.print("7) É autodidata? (V/F): ");
        resp7 = key.next();
        System.out.print("8) Aceitaria salário inicial de R$1500? (V/F): ");
        resp8 = key.next();
        System.out.print("9) Só aceita trabalhar na grande BH? (V/F): ");
        resp9 = key.next();

        p1 = resp1.equalsIgnoreCase("V");
        p2 = resp2.equalsIgnoreCase("V");
        p3 = resp3.equalsIgnoreCase("V");
        p4 = resp4.equalsIgnoreCase("V");
        p5 = resp5.equalsIgnoreCase("V");
        p6 = resp6.equalsIgnoreCase("V");
        p7 = resp7.equalsIgnoreCase("V");
        p8 = resp8.equalsIgnoreCase("V");
        p9 = resp9.equalsIgnoreCase("V");

        apto = p1 && !p2 && !p3 && p4 && !p6 && p7 && !p9;

        if (p5) {
            apto = apto && !p8;
        }

        if (apto) {
            System.out.println("A pessoa está APTA para a função de programador.");
        } else {
            System.out.println("A pessoa NÃO está apta para a função de programador.");
        }

        key.close();
    }

}
