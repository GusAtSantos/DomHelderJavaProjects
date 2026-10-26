package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex15 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int codigoPacote, dias;
        double extras;
        String cidade;

        double valorFixo, diariaPPP, canaisPPP, percentualImposto, subtotal, imposto, conta;

        System.out.print("Código do pacote (1, 2 ou 3): ");
        codigoPacote = key.nextInt();

        System.out.print("Dias de consumo PPP: ");
        dias = key.nextInt();

        System.out.print("Valor dos serviços extras: ");
        extras = key.nextDouble();
        key.nextLine();

        System.out.print("Cidade do assinante: ");
        cidade = key.nextLine();

        if (codigoPacote == 1) {
            valorFixo = 65.00;
            diariaPPP = 1.20;
            canaisPPP = dias * diariaPPP;
            if (canaisPPP > 65.00) {
                canaisPPP = 65.00;
            }
        } else if (codigoPacote == 2) {
            valorFixo = 104.00;
            diariaPPP = 2.10;
            canaisPPP = dias * diariaPPP;
        } else {
            valorFixo = 137.00;
            canaisPPP = 0;
        }

        if (cidade.equals("Belo Horizonte")) {
            percentualImposto = 0;
        } else if (cidade.equals("São Paulo")) {
            percentualImposto = 0.01;
        } else if (cidade.equals("Rio de Janeiro")) {
            percentualImposto = 0.015;
        } else {
            percentualImposto = 0.02;
        }

        subtotal = valorFixo + canaisPPP + extras;
        imposto = subtotal * percentualImposto;
        conta = subtotal + imposto;

        System.out.printf("Conta = R$%.2f%n", conta);

        key.close();
    }

}
