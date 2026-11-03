package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex03 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String placa;
        int dia, pontos, multas8Quinzena;
        double valorMulta, totalArrecadado;

        multas8Quinzena = 0;
        totalArrecadado = 0;

        System.out.print("Dia da multa (99 para encerrar): ");
        dia = key.nextInt();

        while (dia != 99) {
            System.out.print("Placa: ");
            placa = key.next();
            System.out.print("Pontos (3, 5 ou 8): ");
            pontos = key.nextInt();

            switch (pontos) {
                case 3:
                    valorMulta = 42.00;
                    break;
                case 5:
                    valorMulta = 108.00;
                    break;
                case 8:
                    valorMulta = 479.00;
                    break;
                default:
                    valorMulta = 0;
            }

            if (valorMulta == 0) {
                System.out.println("Pontuação inválida! Multa ignorada.");
            } else {
                System.out.printf("Placa %s - Multa = R$ %.2f%n", placa, valorMulta);
                totalArrecadado += valorMulta;
                if (pontos == 8 && dia <= 15) {
                    multas8Quinzena++;
                }
            }

            System.out.print("Dia da multa (99 para encerrar): ");
            dia = key.nextInt();
        }

        System.out.println("Multas de 8 pontos na primeira quinzena = " + multas8Quinzena);
        System.out.printf("Valor total arrecadado = R$ %.2f%n", totalArrecadado);

        key.close();
    }
}