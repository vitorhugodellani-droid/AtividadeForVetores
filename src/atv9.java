import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] sorteados = {5, 12, 23, 31, 44, 58};
        int[] apostados = new int[6];
        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Numero apostado " + (i + 1) + ": ");
            apostados[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Numeros apostados: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(apostados[i] + " ");
        }

        System.out.println("Numeros sorteados: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(sorteados[i] + " ");
        }

        System.out.println("Voce acertou os numeros: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (apostados[i] == sorteados[j]) {
                    System.out.println(apostados[i] + " ");
                    acertos = acertos + 1;
                }
            }
        }

        System.out.println("Total de acertos: " + acertos);
    }
}