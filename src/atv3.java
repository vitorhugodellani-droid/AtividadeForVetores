import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Nota dos alunos " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 6) {
                aprovados = aprovados + 1;
            } else {
                reprovados = reprovados + 1;
            }
        }
        System.out.println();
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}