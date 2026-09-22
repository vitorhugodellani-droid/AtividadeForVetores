import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] precos = new double[6];
        double total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Preco do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        for (int i = 0; i < 6; i++) {
            total = total + precos[i];
        }

        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("Produto " + (i + 1) + ": R$ " + precos[i]);
        }
        System.out.println("Total da compra: R$ " + total);

        System.out.println("Quanto dinheiro voce possui? R$ ");
        double dinheiro = sc.nextDouble();

        if (dinheiro >= total) {
            System.out.println("Valor suficiente para a compra!");
        } else {
            System.out.println("Valor insuficiente. Faltam R$ " + (total - dinheiro));
        }
    }
}