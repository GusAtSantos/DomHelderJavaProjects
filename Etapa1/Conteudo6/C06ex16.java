package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C06ex16 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int faltas, idade;
        double prova1, prova2, prova3, trabalho;
        double peso1, peso2, menor, mediaDuasMaiores, notaFinal;
        String resultado;

        System.out.print("Faltas: ");
        faltas = key.nextInt();

        System.out.print("Nota da prova 1: ");
        prova1 = key.nextDouble();
        System.out.print("Nota da prova 2: ");
        prova2 = key.nextDouble();
        System.out.print("Nota da prova 3: ");
        prova3 = key.nextDouble();

        System.out.print("Nota do trabalho final: ");
        trabalho = key.nextDouble();

        System.out.print("Idade: ");
        idade = key.nextInt();

        if (faltas <= 5) {
            peso1 = 3;
        } else if (faltas <= 10) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        if (idade <= 17) {
            peso2 = 1;
        } else if (idade <= 50) {
            peso2 = 2;
        } else {
            peso2 = 3;
        }

        menor = Math.min(Math.min(prova1, prova2), prova3);
        mediaDuasMaiores = (prova1 + prova2 + prova3 - menor) / 2.0;

        notaFinal = (mediaDuasMaiores * peso1) + (trabalho * peso2);

        if (notaFinal <= 50) {
            resultado = "Reprovado";
        } else if (notaFinal <= 70) {
            resultado = "Regular";
        } else if (notaFinal <= 80) {
            resultado = "Bom";
        } else if (notaFinal <= 90) {
            resultado = "Muito Bom";
        } else {
            resultado = "Excelente";
        }

        System.out.println("Resultado Final = " + resultado);

        key.close();
    }

}
