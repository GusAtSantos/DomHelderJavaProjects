package Etapa2.Conteudo11;

/* Gustavo Rafael Atanasio dos Santos */
import java.util.Scanner;

public class C11ex09 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nome, rf, nomeAntigo, nomeNovo, setorMais;
        int ano, setor, ordem, chave, chaveAntigo, chaveNovo;
        int gerencia, administracao, pesquisa, obras, adm2010, maisFunc;
        boolean valido;

        gerencia = 0;
        administracao = 0;
        pesquisa = 0;
        obras = 0;
        adm2010 = 0;
        nomeAntigo = "";
        nomeNovo = "";
        chaveAntigo = Integer.MAX_VALUE;
        chaveNovo = 0;

        System.out.print("Nome do funcionário (FIM para encerrar): ");
        nome = key.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Registro funcional (RF): ");
            rf = key.nextLine();

            valido = false;
            ano = 0;
            setor = 0;
            ordem = 0;

            if (rf.length() == 6 && rf.matches("[0-9]+")) {
                ano = 2000 + Integer.parseInt(rf.substring(0, 2));
                setor = Integer.parseInt(rf.substring(2, 3));
                ordem = Integer.parseInt(rf.substring(3));
                if (ano >= 2010 && ano <= 2014 && setor >= 1 && setor <= 4) {
                    valido = true;
                }
            }

            if (!valido) {
                System.out.println(nome + ": REGISTRO INVÁLIDO");
            } else {
                switch (setor) {
                    case 1:
                        gerencia++;
                        break;
                    case 2:
                        administracao++;
                        if (ano == 2010) {
                            adm2010++;
                        }
                        break;
                    case 3:
                        pesquisa++;
                        break;
                    default:
                        obras++;
                }

                chave = ano * 1000 + ordem;
                if (chave < chaveAntigo) {
                    chaveAntigo = chave;
                    nomeAntigo = nome;
                }
                if (chave > chaveNovo) {
                    chaveNovo = chave;
                    nomeNovo = nome;
                }
            }

            System.out.print("Nome do funcionário (FIM para encerrar): ");
            nome = key.nextLine();
        }

        maisFunc = gerencia;
        setorMais = "Gerência";
        if (administracao > maisFunc) {
            maisFunc = administracao;
            setorMais = "Administração";
        }
        if (pesquisa > maisFunc) {
            maisFunc = pesquisa;
            setorMais = "Pesquisa";
        }
        if (obras > maisFunc) {
            maisFunc = obras;
            setorMais = "Obras";
        }

        System.out.println("Funcionários por setor:");
        System.out.println("Gerência = " + gerencia);
        System.out.println("Administração = " + administracao);
        System.out.println("Pesquisa = " + pesquisa);
        System.out.println("Obras = " + obras);
        System.out.println("Entraram em 2010 na Administração = " + adm2010);
        System.out.println("Setor que tem mais funcionários = " + setorMais);
        if (!nomeAntigo.equals("")) {
            System.out.println("Funcionário mais antigo = " + nomeAntigo);
            System.out.println("Funcionário mais novo = " + nomeNovo);
        }

        key.close();
    }
}