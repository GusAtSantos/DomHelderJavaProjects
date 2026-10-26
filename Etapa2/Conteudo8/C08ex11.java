package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos
import javax.swing.JOptionPane;

public class C08ex11 {

    public static void main(String[] args) {
        String[] opcoesSexo = {"Masculino", "Feminino"};
        String[] opcoesEstadoCivil = {"Casado", "Solteiro", "Outros"};
        String[] opcoesOlhos = {"Azul", "Castanhos", "Preto", "Outros"};
        String[] opcoesCabelos = {"Loiro", "Preto", "Castanhos", "Ruivos"};
        String[] opcoesEscolaridade = {"Analfabeto", "Fundamental", "Médio", "Superior"};

        String nome, nomeMaiorSalario;
        int qtdPessoas, idade, sexo, estadoCivil, corOlhos, corCabelo, escolaridade;
        int contPerfil, contHomens;
        double salario, maiorSalario, maiorSalarioHomem, menorSalarioHomem, diferenca;

        qtdPessoas = 50;
        contPerfil = 0;
        contHomens = 0;
        nomeMaiorSalario = "";
        maiorSalario = 0;
        maiorSalarioHomem = 0;
        menorSalarioHomem = 0;

        for (int aux = 1; aux <= qtdPessoas; aux++) {
            nome = JOptionPane.showInputDialog("Nome:");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));

            sexo = JOptionPane.showOptionDialog(null, "Sexo:", "Cadastro",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoesSexo, opcoesSexo[0]);
            estadoCivil = JOptionPane.showOptionDialog(null, "Estado civil:", "Cadastro",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoesEstadoCivil, opcoesEstadoCivil[0]);
            corOlhos = JOptionPane.showOptionDialog(null, "Cor dos olhos:", "Cadastro",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoesOlhos, opcoesOlhos[0]);
            corCabelo = JOptionPane.showOptionDialog(null, "Cor dos cabelos:", "Cadastro",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoesCabelos, opcoesCabelos[0]);

            salario = Double.parseDouble(JOptionPane.showInputDialog("Salário (R$):"));

            escolaridade = JOptionPane.showOptionDialog(null, "Escolaridade:", "Cadastro",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoesEscolaridade, opcoesEscolaridade[0]);

            if (sexo == 1 && corCabelo == 0 && corOlhos == 0
                    && idade >= 18 && idade <= 25
                    && estadoCivil == 1 && salario > 10000 && escolaridade == 3) {
                contPerfil++;
            }

            if (aux == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            if (sexo == 0) {
                contHomens++;
                if (contHomens == 1 || salario > maiorSalarioHomem) {
                    maiorSalarioHomem = salario;
                }
                if (contHomens == 1 || salario < menorSalarioHomem) {
                    menorSalarioHomem = salario;
                }
            }
        }

        System.out.println("Mulheres loiras, de olhos azuis, 18 a 25 anos, solteiras, salário > R$10.000 e superior = " + contPerfil);
        System.out.println("Pessoa com maior salário = " + nomeMaiorSalario);

        if (contHomens > 0) {
            diferenca = maiorSalarioHomem - menorSalarioHomem;
            System.out.printf("Diferença entre o maior e o menor salário dos homens = R$%.2f%n", diferenca);
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }
    }

}
