package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C10ex07 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int populacao, dias, anos, meses, diasRestantes;
        double infectados;

        do {
            System.out.print("Informe a população da região: ");
            populacao = key.nextInt();
        } while (populacao < 1);

        infectados = 1;
        dias = 0;

        while (infectados < populacao) {
            infectados = infectados + infectados * 0.003;
            dias++;
        }

        anos = dias / 365;
        meses = (dias % 365) / 30;
        diasRestantes = (dias % 365) % 30;

        System.out.println("Anos = " + anos + "  Meses = " + meses + "  Dias = " + diasRestantes);

        key.close();
    }
}