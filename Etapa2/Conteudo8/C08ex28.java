package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

public class C08ex28 {

    public static void main(String[] args) {

        int produto, soma, cont;

        double media;

        soma = 0;
        cont = 0;

        for (int aux = 1; aux <= 1000; aux++) {
            produto = aux * (aux + 1) * (aux + 2);

            if (produto > 1000) {
                break;
            }

            System.out.println(produto);
            soma += produto;
            cont++;
        }

        media = (double) soma / cont;

        System.out.println("Média = " + media);
    }

}
