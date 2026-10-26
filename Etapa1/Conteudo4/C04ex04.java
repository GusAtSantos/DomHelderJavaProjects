package Etapa1;

// Gustavo Rafael Atanasio dos Santos

import javax.swing.JOptionPane;

public class C04ex04 {
    static void main( String[] args) {

        String nome, nomeDoMeio, sobreNome, idadeSTR;

        nome = JOptionPane.showInputDialog(null,
                " Qual o seu nome?:  ",
                " C04ex04 ",
                JOptionPane.QUESTION_MESSAGE);
        nomeDoMeio = JOptionPane.showInputDialog(null,
                " Qual o seu nome do meio?:  ",
                " C04ex04 ",
                JOptionPane.QUESTION_MESSAGE);
        sobreNome = JOptionPane.showInputDialog(null,
                " Qual o seu aobre nome?:  ",
                " C04ex04 ",
                JOptionPane.QUESTION_MESSAGE);
        idadeSTR = JOptionPane.showInputDialog(null,
                " Qual a sua idade?:  ",
                " C04ex04 ",
                JOptionPane.QUESTION_MESSAGE);

        int idade = Integer.valueOf(idadeSTR);

        JOptionPane.showMessageDialog(null,
                sobreNome + " , " + nome + " " + nomeDoMeio + "\n" + " Idade: " + idade + " Anos. " );
    }
}
