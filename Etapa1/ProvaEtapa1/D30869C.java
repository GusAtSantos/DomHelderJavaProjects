package Provas;

// Gustavo Rafael Atanasio dos Santos

import javax.swing.*;

public class D30869C {

    static void main(String[] args) {

        double ipva;
        long ano;
        String ipvaStr,anoStr,combustivel;

        ipvaStr = JOptionPane.showInputDialog(null,
                " Qual o valor original do IPVA ?:  ",
                " Questão C ",
                JOptionPane.QUESTION_MESSAGE);
        combustivel = JOptionPane.showInputDialog(null,
                " Qual o tipo de combustivel? Alcool = A Gasolina = G Disel = D :  ",
                " Questão C ",
                JOptionPane.QUESTION_MESSAGE);
        anoStr = JOptionPane.showInputDialog(null,
                " Qual é o ano de fabricação do seu veiculo?:  ",
                " Questão C ",
                JOptionPane.QUESTION_MESSAGE);

        ipva = Double.valueOf(ipvaStr);
        ano = Long.valueOf(anoStr);

        if (String.valueOf(combustivel) == "A"){

            if (ano < 1960){
                ipva = 0;
                JOptionPane.showMessageDialog(null," O seu veiculo está isento de IPVA  R$ " + ipva);
            } else if (ano >= 1960 && ano <= 1970){
                ipva = ipva * 0.55;
                JOptionPane.showMessageDialog(null," Valor do IPVA a ser pago : R$ " + ipva);
            } else if (ano >= 1971 && ano <= 1980 ) {
                ipva = ipva * 0.25;
                JOptionPane.showMessageDialog(null," Valor do IPVA a ser pago : R$ " + ipva);
            } else if (ano >1980) {
                JOptionPane.showMessageDialog(null," Valor do IPVA a ser pago : R$ " + ipva);
            }

        } else {

            if (ano < 1960){

                ipva = 0;
                JOptionPane.showMessageDialog(null," O seu veiculo está isento de IPVA  R$ " + ipva);

            }
            else if (ano >= 1960 && ano <= 1970){

                ipva = ipva * 0.55;
                JOptionPane.showMessageDialog(null," Valor do IPVA a ser pago : R$ " + ipva);

            } else if (ano >= 1971 && ano <= 1980 ) {
                ipva = ipva * 0.25;
                JOptionPane.showMessageDialog(null," Valor do IPVA a ser pago : R$ " + ipva);

            } else if (ano > 1980) {
                JOptionPane.showMessageDialog(null," Valor do IPVA a ser pago : R$ " + ipva);
            }

        }

    }



}
