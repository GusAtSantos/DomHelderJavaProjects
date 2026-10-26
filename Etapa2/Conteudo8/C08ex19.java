package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos

public class C08ex19 {

    public static void main(String[] args) {
        int termo, soma;

        soma = 0;

        for (int aux = 1; aux <= 100; aux++) {
            termo = aux * aux;
            System.out.println(termo);
            soma += termo;
        }

        System.out.println("Soma dos 100 primeiros termos: " + soma);
    }

}
