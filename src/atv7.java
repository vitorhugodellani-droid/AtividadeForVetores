import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] velocidades = new int[10];
        int limite = 80;
        int acimaDoLimite = 0;
        int maiorVelocidade = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Velocidade do veiculo " + (i + 1) + ": ");
            velocidades[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {

            if (velocidades[i] > limite) {
                System.out.println("Veiculo " + (i + 1) + ": " + velocidades[i] + " km/h - ACIMA DO LIMITE");
                acimaDoLimite = acimaDoLimite + 1;
            } else {
                System.out.println("Veiculo " + (i + 1) + ": " + velocidades[i] + " km/h");
            }

            if (velocidades[i] > maiorVelocidade) {
                maiorVelocidade = velocidades[i];
            }
        }

        System.out.println("Total acima do limite: " + acimaDoLimite);
        System.out.println("Maior velocidade registrada: " + maiorVelocidade);
    }
}