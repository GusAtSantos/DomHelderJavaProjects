package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;

public class C08ex15 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String nome, cargo, nomeMaior, cargoMaior;
        int qtdFuncionarios, idade, contAte18;
        double salario, maiorSalario, somaSalariosAte18, mediaAte18;

        qtdFuncionarios = 1000;
        contAte18 = 0;
        somaSalariosAte18 = 0;
        maiorSalario = 0;
        nomeMaior = "";
        cargoMaior = "";

        for (int aux = 1; aux <= qtdFuncionarios; aux++) {
            System.out.print("Nome: ");
            nome = key.nextLine();

            System.out.print("Cargo: ");
            cargo = key.nextLine();

            System.out.print("Salário: ");
            salario = key.nextDouble();

            System.out.print("Idade: ");
            idade = key.nextInt();
            key.nextLine();

            if (salario > 10000 && idade > 50) {
                System.out.println(nome + " é SÊNIOR");
            }

            if (idade <= 18) {
                somaSalariosAte18 += salario;
                contAte18++;
            }

            if (aux == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }

        if (contAte18 > 0) {
            mediaAte18 = somaSalariosAte18 / contAte18;
            System.out.printf("Média dos salários dos funcionários com até 18 anos = R$%.2f%n", mediaAte18);
        } else {
            System.out.println("Nenhum funcionário com até 18 anos.");
        }

        System.out.println("Funcionário com maior salário = " + nomeMaior + " – " + cargoMaior);

        key.close();
    }

}
