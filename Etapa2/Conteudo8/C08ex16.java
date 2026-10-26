package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos

public class C08ex16 {

    public static void main(String[] args) {
        int soma, cont;
        double media;

        soma = 0;
        cont = 0;

        for (int aux = 1000; aux <= 2000; aux++) {
            if (aux % 2 != 0) {
                soma += aux;
                cont++;
            }
        }

        media = (double) soma / cont;

        System.out.println("Média dos números ímpares = " + media);
    }

}
