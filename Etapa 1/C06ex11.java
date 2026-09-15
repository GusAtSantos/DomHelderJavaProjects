package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex11 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String equipe1, equipe2, vencedor, perdedor ;
        int sets1, sets2, setsPerdedor;

        System.out.print("Nome da equipe 1: ");
         equipe1 = key.next();

        System.out.print("Nome da equipe 2: ");
         equipe2 = key.next();

        System.out.print("Sets ganhos pela equipe 1: ");
         sets1 = key.nextInt();
         
        System.out.print("Sets ganhos pela equipe 2: ");
         sets2 = key.nextInt();



        if (sets1 == 3) {
            vencedor = equipe1;
            perdedor = equipe2;
            setsPerdedor = sets2;
        } else {
            vencedor = equipe2;
            perdedor = equipe1;
            setsPerdedor = sets1;
        }

        int pontosVencedor;
        int pontosPerdedor;

        if (setsPerdedor <= 1) {
            pontosVencedor = 3;
            pontosPerdedor = 0;
        } else {
            pontosVencedor = 2;
            pontosPerdedor = 1;
        }

        System.out.println("Pontos " + vencedor + " = " + pontosVencedor);
        System.out.println("Pontos " + perdedor + " = " + pontosPerdedor);

        key.close();

    }

}
