package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos

import java.util.Scanner;

public class C08ex05a {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int voto, votosFulano, votosCiclano, votosBeltrano, votosNulos, votosValidos;
        int maior, empatados;
        boolean fulanoNaDisputa, ciclanoNaDisputa, beltranoNaDisputa;

        fulanoNaDisputa = true;
        ciclanoNaDisputa = true;
        beltranoNaDisputa = true;

        for (int turno = 1; turno <= 2; turno++) {
            votosFulano = 0;
            votosCiclano = 0;
            votosBeltrano = 0;
            votosNulos = 0;

            System.out.println("=== " + turno + "º TURNO ===");

            for (int aux = 1; aux <= 5; aux++) {
                System.out.print("Digite o voto (1-Fulano, 2-Ciclano, 3-Beltrano): ");
                voto = key.nextInt();

                if (voto == 1 && fulanoNaDisputa) {
                    votosFulano++;
                } else if (voto == 2 && ciclanoNaDisputa) {
                    votosCiclano++;
                } else if (voto == 3 && beltranoNaDisputa) {
                    votosBeltrano++;
                } else {
                    votosNulos++;
                }
            }

            votosValidos = votosFulano + votosCiclano + votosBeltrano;

            System.out.println("Votos Fulano = " + votosFulano);
            System.out.println("Votos Ciclano = " + votosCiclano);
            System.out.println("Votos Beltrano = " + votosBeltrano);
            System.out.println("Votos Nulos = " + votosNulos);

            if (votosNulos > votosValidos) {
                System.out.println("ELEIÇÃO ANULADA (" + turno + "º turno)");
                break;
            }

            maior = Math.max(votosFulano, Math.max(votosCiclano, votosBeltrano));

            fulanoNaDisputa = (votosFulano == maior);
            ciclanoNaDisputa = (votosCiclano == maior);
            beltranoNaDisputa = (votosBeltrano == maior);

            empatados = 0;
            if (fulanoNaDisputa) empatados++;
            if (ciclanoNaDisputa) empatados++;
            if (beltranoNaDisputa) empatados++;

            if (empatados == 1) {
                if (fulanoNaDisputa) {
                    System.out.println("Vencedor: Fulano");
                } else if (ciclanoNaDisputa) {
                    System.out.println("Vencedor: Ciclano");
                } else {
                    System.out.println("Vencedor: Beltrano");
                }
                break;
            }

            if (turno == 1) {
                System.out.println("Houve empate! Segundo turno entre:");
                if (fulanoNaDisputa) System.out.println("- Fulano");
                if (ciclanoNaDisputa) System.out.println("- Ciclano");
                if (beltranoNaDisputa) System.out.println("- Beltrano");
            } else {
                System.out.println("O empate persistiu no 2º turno.");
            }
        }

        key.close();
    }
}
