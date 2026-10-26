package Etapa2.Conteudo8;
// Gustavo Rafael Atanasio dos Santos
import java.util.Scanner;
public class C08ex05 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int voto, votosFulano, votosCiclano, votosBeltrano;

        votosFulano = 0;
        votosCiclano = 0;
        votosBeltrano = 0;

        for (int aux = 1; aux <= 100; aux++) {
            System.out.print("Digite o voto (1-Fulano, 2-Ciclano, 3-Beltrano): ");
            voto = key.nextInt();

            switch (voto) {
                case 1:
                    votosFulano++;
                    break;
                case 2:
                    votosCiclano++;
                    break;
                case 3:
                    votosBeltrano++;
                    break;
            }
        }

        System.out.println("Votos Fulano = " + votosFulano);
        System.out.println("Votos Ciclano = " + votosCiclano);
        System.out.println("Votos Beltrano = " + votosBeltrano);

        if (votosFulano > votosCiclano && votosFulano > votosBeltrano) {
            System.out.println("Vencedor: Fulano");
        } else if (votosCiclano > votosFulano && votosCiclano > votosBeltrano) {
            System.out.println("Vencedor: Ciclano");
        } else {
            System.out.println("Vencedor: Beltrano");
        }

        key.close();
    }
}
