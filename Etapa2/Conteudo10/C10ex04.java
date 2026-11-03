package Etapa2.Conteudo10;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C10ex04 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nome;
        int quantidade;
        double taxaBdi, preco, custoParcial, custoTotal, valorBdi, precoFinal;

        custoTotal = 0;

        System.out.print("Informe a taxa de BDI (%): ");
        taxaBdi = key.nextDouble();

        do {
            System.out.print("Nome do material (FIM para encerrar): ");
            nome = key.next();

            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.print("Quantidade: ");
                quantidade = key.nextInt();
                System.out.print("Preço unitário: ");
                preco = key.nextDouble();

                custoParcial = quantidade * preco;
                System.out.printf("Custo parcial de %s = R$ %.2f%n", nome, custoParcial);
                custoTotal += custoParcial;
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        valorBdi = custoTotal * taxaBdi / 100;
        precoFinal = custoTotal + valorBdi;

        System.out.printf("Custo Total = %.2f%n", custoTotal);
        System.out.printf("BDI (%.0f%% de %.2f) = %.2f%n", taxaBdi, custoTotal, valorBdi);
        System.out.printf("Preço Final (%.2f + %.2f) = %.2f%n", custoTotal, valorBdi, precoFinal);

        key.close();
    }
}