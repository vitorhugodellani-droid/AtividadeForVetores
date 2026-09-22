import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Qual numero deseja procurar? ");
        int procurado = sc.nextInt();

        int quantidadeEncontrada = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == procurado) {
                System.out.println("Numero encontrado na posicao " + i + ".");
                quantidadeEncontrada = quantidadeEncontrada + 1;
            }
        }

        if (quantidadeEncontrada == 0) {
            System.out.println("Numero nao encontrado.");
        }
    }
}