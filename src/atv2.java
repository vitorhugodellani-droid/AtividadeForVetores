import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double [] temperaturas = new double[7];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Qual a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();}

        for (int i = 0; i < 7; i++) {
            soma = soma + temperaturas[i];
        }

        media= soma / 7;
        System.out.println("A média da temperatura da semana é de " + media + " C");
    }
}
