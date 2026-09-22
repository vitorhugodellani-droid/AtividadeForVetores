import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] pontos = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nome do jogador " + (i + 1) + ": ");
            nomes[i] = sc.next();
            System.out.println("Pontuacao do jogador " + (i + 1) + ": ");
            pontos[i] = sc.nextInt();
        }
        int maiorPontuacao = 0;
        int posicaoCampeao = 0;

        for (int i = 0; i < 5; i++) {
            if (pontos[i] > maiorPontuacao) {
                maiorPontuacao = pontos[i];
                posicaoCampeao = i;
            }
        }

        System.out.println("Campeao: " + nomes[posicaoCampeao] + " - " + maiorPontuacao + " pontos");
    }
}