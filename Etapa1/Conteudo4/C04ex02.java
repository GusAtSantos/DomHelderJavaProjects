package Etapa1;

//Gustavo Rafael Atansio Dos Santos

import java.util.Scanner;
import java.text.NumberFormat;

public class C04ex02 {

    static void main(String[] args) {

      String nomeCompleto, ci, empresa,formatSalario;
      long tituloDeEleitor, cnh, cpf;
      double salario;


      Scanner key = new Scanner(System.in);

      System.out.print(" Qual o seu nome completo?: ");
      nomeCompleto = key.nextLine();

      System.out.print(" Agora vamos para a sua documentação : ");

      System.out.print(" \n Qual o seu CPF?: ");
      cpf = key.nextLong();

      key.nextLine();
      System.out.print(" Qual a sua C.I?: ");
      ci = key.nextLine();

      System.out.print(" Qual o seu titulo de eleitor? ");
      tituloDeEleitor = key.nextLong();

      System.out.print(" Qual a sua CNH?: ");
      cnh = key.nextLong();

      key.nextLine();
      System.out.print(" Qual o nome da sua empresa?: ");
      empresa = key.nextLine();

      System.out.print(" Qual é o seu ganho salarial?: ");
      salario = key.nextDouble();
      formatSalario = NumberFormat.getCurrencyInstance().format(salario);

      System.out.print("--------------------------------------- ");
      System.out.println(" \n Ficha funcional de : " + " \n " + nomeCompleto );
      System.out.print("---------------------------------------");
      System.out.println(" ");
      System.out.println("  Documentos:  ");
      System.out.print("---------------------------------------");
      System.out.println(" \n  CPF............... " + cpf + " \n  C.I............... " + ci + " \n  Titulo de eleitor. " + tituloDeEleitor + " \n  CNH............... " + cnh);
      System.out.print(" ");
      System.out.print("---------------------------------------");
      System.out.print(" ");
      System.out.println(" \n  Empresa: " + empresa + " \n  Salario: " + formatSalario);
      System.out.print(" ");
      System.out.print("---------------------------------------");

      key.close();
    }

}
