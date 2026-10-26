package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex18 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int numero, resultado;

        System.out.print("Digite um número inteiro de 1 a 9: ");
        numero = key.nextInt();

        for (int aux = 1; aux <= 9; aux++) {
            resultado = aux * numero;
            System.out.println(aux + " x " + numero + " = " + resultado);
        }

        key.close();
    }

}
