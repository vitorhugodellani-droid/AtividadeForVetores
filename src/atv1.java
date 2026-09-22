import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] pontos = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Pontuação do jogador " + (i + 1) + ": ");
            pontos[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + pontos[i] + " pontos");


        }
    }
}
