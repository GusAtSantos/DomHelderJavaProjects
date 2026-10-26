package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C07ex04 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String time;

        System.out.print("Digite o nome do time: ");
        time = key.nextLine();

        switch (time) {
            case "América": case "Atlético": case "Cruzeiro": case "Villa Nova":
                System.out.println("Minas Gerais");
                break;
            case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
                System.out.println("Rio de Janeiro");
                break;
            case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
                System.out.println("São Paulo");
                break;
            case "Grêmio": case "Internacional": case "Juventude":
                System.out.println("Rio Grande do Sul");
                break;
            case "Náutico": case "Santa Cruz": case "Sport":
                System.out.println("Pernambuco");
                break;
            default:
                System.out.println("Time não encontrado");
                break;
        }

        key.close();
    }

}
