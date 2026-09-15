package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;


public class C07ex01 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String nome;
        int acertos;

        System.out.print("Nome do apostador: ");
        nome = key.nextLine();

        System.out.print("Quantidade de acertos: ");
        acertos = key.nextInt();

        switch (acertos) {
            case 6: case 7: case 8: case 9: case 10:
                System.out.println(nome + " ganhou outro cartão!");
                break;
            case 11:
                System.out.printf("%s ganhou R$%.2f%n", nome, 100.00);
                break;
            case 12:
                System.out.printf("%s ganhou R$%.2f%n", nome, 1000.00);
                break;
            case 13:
                System.out.printf("%s ganhou R$%.2f%n", nome, 50000.00);
                break;
            default:
                System.out.println(nome + " não ganhou prêmio nenhum.");
                break;
        }

        key.close();
    }

}
