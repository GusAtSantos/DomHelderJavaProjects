package Etapa2.Conteudo8;

// Gustavo Rafael Atanasio dos Santos

public class C08ex17 {

    public static void main(String[] args) {
        double fx;

        for (int aux = 3; aux <= 12; aux++) {
            fx = Math.sqrt(Math.pow(aux, 2) - 3);
            System.out.println("x=" + aux + "  f(x)=" + fx);
        }
    }

}
