package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

public class C08ex26 {

    static void main() {


        for (int aux = 1; aux <= 10 ; aux++){

            for (int aux2 = 1; aux2 <=10; aux2++){
                for (int aux3 = 1; aux3 <= aux2; aux3++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int aux2 = 10; aux2 >= 1; aux2--){
                for (int aux4 = 1; aux4 <= aux2; aux4++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }

    }

}
