package Etapa2.Conteudo8;

/* Gustavo Rafael Atanasio dos Santos */

import java.util.Scanner;

public class C08ex31 {

    static void main() {

        Scanner key = new Scanner(System.in);

        String nome, cargo, descricao, nomeMenor, descricaoMenor;
        int qtdEngenheiros, contAcimaMinimo, contAdm, contOutros5000;
        double salario, salarioMinimo, somaAdm, mediaAdm, menorSalario;
        boolean temMinimo;

        contAcimaMinimo = 0;
        contAdm = 0;
        contOutros5000 = 0;
        somaAdm = 0;
        salarioMinimo = 0;
        menorSalario = 0;
        descricao = "";
        nomeMenor = "";
        descricaoMenor = "";
        temMinimo = false;

        System.out.print("Quantos engenheiros foram pesquisados? ");
        qtdEngenheiros = key.nextInt();
        key.nextLine();

        for (int aux = 1; aux <= qtdEngenheiros; aux++) {
            System.out.print("Nome: ");
            nome = key.nextLine();

            System.out.print("Código do cargo (C, P, O, A ou X): ");
            cargo = key.nextLine().toUpperCase();

            System.out.print("Salário bruto: ");
            salario = key.nextDouble();
            key.nextLine();

            temMinimo = true;

            switch (cargo) {
                case "C":
                    descricao = "Engenheiro Calculista";
                    salarioMinimo = 2500.00;
                    break;
                case "P":
                    descricao = "Engenheiro Projetista";
                    salarioMinimo = 4650.00;
                    break;
                case "O":
                    descricao = "Engenheiro de Obra";
                    salarioMinimo = 3200.00;
                    break;
                case "A":
                    descricao = "Engenheiro Administrador";
                    salarioMinimo = 5100.00;
                    break;
                case "X":
                    descricao = "Outros";
                    temMinimo = false;
                    break;
                default:
                    descricao = "Cargo inválido";
                    temMinimo = false;
                    break;
            }

            if (temMinimo) {
                if (salario < salarioMinimo) {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                } else {
                    contAcimaMinimo++;
                }
            }

            if (cargo.equals("A")) {
                somaAdm += salario;
                contAdm++;
            }

            if (cargo.equals("X") && salario > 5000) {
                contOutros5000++;
            }

            if (aux == 1 || salario < menorSalario) {
                menorSalario = salario;
                nomeMenor = nome;
                descricaoMenor = descricao;
            }
        }

        if (contAdm > 0) {
            mediaAdm = somaAdm / contAdm;
            System.out.printf("Média dos salários dos Administradores = R$%.2f%n", mediaAdm);
        } else {
            System.out.println("Nenhum Administrador foi pesquisado.");
        }

        System.out.println("Quantidade de salários igual ou acima do mínimo = " + contAcimaMinimo);
        System.out.println("Quantidade de engenheiros 'Outros' que recebem acima de R$5000 = " + contOutros5000);
        System.out.printf("Menor salário = %s, %s, R$%.2f%n", nomeMenor, descricaoMenor, menorSalario);

        key.close();

    }

}
