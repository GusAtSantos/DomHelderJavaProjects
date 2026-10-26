package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex07 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String nome;
        int idade, qtdAlunos, ate12, acima30, somaIdades;
        double media;

        qtdAlunos = 50;
        ate12 = 0;
        acima30 = 0;
        somaIdades = 0;

        for (int aux = 1; aux <= qtdAlunos; aux++) {
            System.out.print("Nome: ");
            nome = key.nextLine();

            System.out.print("Idade: ");
            idade = key.nextInt();
            key.nextLine();

            if (idade <= 12) {
                ate12++;
            }

            if (idade > 30) {
                acima30++;
            }

            somaIdades += idade;
        }

        media = (double) somaIdades / qtdAlunos;

        System.out.println("Alunos que tem até 12 anos = " + ate12);
        System.out.println("Alunos que tem acima de 30 anos = " + acima30);
        System.out.println("Média das idades informadas = " + media);

        key.close();
    }
}
