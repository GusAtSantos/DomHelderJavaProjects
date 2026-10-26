package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

public class C08ex24 {

    static void main() {

        Double soma, serie;

        soma = 0.0;

        for (int aux = 1 ; aux <= 99; aux += 2 ){
            soma += Math.pow(2, aux);
        }

        serie = (1.0/3) * soma ;

        System.out.println(" Valor da série = " + serie);

    }

}
