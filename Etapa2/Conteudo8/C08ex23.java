package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

public class C08ex23 {

    static void main() {

        int digito1, digito2, digito3, digito4;
        int soma, cont;

        Double media;

        soma = 0;
        cont = 0;

        for (int aux = 1000; aux <= 9999; aux++ ){
            digito1 = aux / 1000;
            digito2 = (aux / 100) % 10;
            digito3 = (aux / 10) % 10;
            digito4 = aux % 10;

            if (digito1 == digito4 && digito2 == digito3){
                System.out.println(aux);
                soma += aux;
                cont++;
            }
        }

        media = (double) soma / cont;

        System.out.print(" Média : " + media);

    }

}
