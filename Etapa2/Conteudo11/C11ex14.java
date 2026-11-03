package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
public class C11ex14 {
    public static void main(String[] args) {
        int termos, sinal;
        double soma, pi;

        soma = 0;
        pi = 0;
        termos = 0;
        sinal = 1;

        while (!(pi > 3.1416 && pi < 3.1417)) {
            termos++;
            soma += sinal * (1.0 / (2 * termos - 1));
            sinal = -sinal;
            pi = 4 * soma;
        }

        System.out.println("Valor de PI = " + pi);
        System.out.println("Termos = " + termos);
    }
}
