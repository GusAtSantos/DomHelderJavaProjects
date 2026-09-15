package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex09 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String sexo;
        double altura, peso;

        System.out.print("Digite a altura (em metros): ");
         altura = key.nextDouble();

        System.out.print("Digite o sexo (M ou F): ");
         sexo = key.next();

        if (sexo.equals("M")) {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }

        System.out.printf("Peso ideal = %.3f kg%n", peso);

        key.close();
    }

}
