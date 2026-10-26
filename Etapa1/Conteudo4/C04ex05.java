package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class C04ex05 {

    static void main(String[] args) {

        String nomeCompleto, ci, empresa, formatSalario;
        long tituloDeEleitor, cnh, cpf;
        double salario;

        Scanner archive = new Scanner(
                C04ex05.class.getResourceAsStream("informacaoFichaFun.text")
        );

        nomeCompleto = archive.nextLine();
        cpf = archive.nextLong();
        archive.nextLine();
        ci = archive.nextLine();
        tituloDeEleitor = archive.nextLong();
        cnh = archive.nextLong();
        archive.nextLine();
        empresa = archive.nextLine();
        salario = archive.nextDouble();
        formatSalario = NumberFormat.getCurrencyInstance().format(salario);

        JOptionPane.showMessageDialog(null,
                "  \n Ficha funcional de : " + nomeCompleto + "\n  Documentos: "
                + " \n  CPF............... " + cpf + " \n  C.I.................. " + ci + " \n  Titulo de eleitor. " + tituloDeEleitor +
                " \n  CNH................... " + cnh + " \n  Empresa: " + empresa + " \n  Salario: " + formatSalario
        );
        archive.close();
    }

}
