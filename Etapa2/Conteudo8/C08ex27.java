package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

public class C08ex27 {

    static void main() {

        int aux7;

        for (int aux = 1; aux <= 10; aux++ ) {

            aux7= 1;
            for (int aux2 = 1; aux2 <= 8; aux2++) {
                for (int aux3 = 1; aux3 <= aux7; aux3++) {
                    System.out.print("*");
                }
                System.out.println();
                aux7 *= 2;
            }

            aux7 = 64;
            for (int aux2 = 1; aux2 <= 7; aux2++) {
                for (int aux3 = 1; aux3 <= aux7; aux3++) {
                    System.out.print("*");
                }
                System.out.println();
                aux7 /= 2;
            }
        }
    }


}
