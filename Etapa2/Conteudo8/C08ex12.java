package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex12 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        final double PRECO1 = 1565.00;
        final double PRECO2 = 1890.00;
        final double PRECO3 = 2150.00;
        final double PRECO4 = 2963.00;
        final double PRECO5 = 3750.00;

        int qtdVendas, codigo;
        int vendas1, vendas2, vendas3, vendas4, vendas5;
        double faturamento;

        qtdVendas = 1000;
        vendas1 = 0;
        vendas2 = 0;
        vendas3 = 0;
        vendas4 = 0;
        vendas5 = 0;

        for (int aux = 1; aux <= qtdVendas; aux++) {
            System.out.print("Código do modelo vendido (1 a 5): ");
            codigo = key.nextInt();

            switch (codigo) {
                case 1:
                    vendas1++;
                    break;
                case 2:
                    vendas2++;
                    break;
                case 3:
                    vendas3++;
                    break;
                case 4:
                    vendas4++;
                    break;
                case 5:
                    vendas5++;
                    break;
                default:
                    System.out.println("Código inválido!");
                    break;
            }
        }

        faturamento = vendas1 * PRECO1 + vendas2 * PRECO2 + vendas3 * PRECO3
                + vendas4 * PRECO4 + vendas5 * PRECO5;

        System.out.printf("Faturamento total = R$%.2f%n", faturamento);

        key.close();
    }

}
