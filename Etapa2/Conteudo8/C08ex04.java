package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex04 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String nome;
        int idade, ate18, acima18;

        ate18 = 0;
        acima18 = 0;

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Nome: ");
            nome = key.nextLine();

            System.out.print("Idade: ");
            idade = key.nextInt();
            key.nextLine();

            if (idade <= 18) {
                ate18++;
            } else {
                acima18++;
            }
        }

        System.out.println("Alunos até 18 anos = " + ate18);
        System.out.println("Alunos acima de 18 anos = " + acima18);

        key.close();
    }
}
