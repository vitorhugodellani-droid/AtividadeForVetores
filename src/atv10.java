import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        double[] notas = new double[10];
        double soma = 0;
        double maiorNota = 0;
        double menorNota = 10;
        int aprovados = 0;
        int reprovados = 0;
        String alunoMaiorNota = "";

        for (int i = 0; i < 10; i++) {
            System.out.println("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.next();
            System.out.println("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {

            if (notas[i] >= 6) {
                System.out.println(nomes[i] + " - " + notas[i] + " APROVADO");
                aprovados = aprovados + 1;
            } else {
                System.out.println(nomes[i] + " - " + notas[i] + " REPROVADO");
                reprovados = reprovados + 1;
            }

            soma = soma + notas[i];
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                alunoMaiorNota = nomes[i];
            }

            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }

        double media = soma / 10;

        System.out.println("Media: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Aluno com maior nota: " + alunoMaiorNota);

        System.out.println("Digite o nome de um aluno para consultar: ");
        String nomeBuscado = sc.next();

        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i] == nomeBuscado) {
                encontrado = true;
                if (notas[i] >= 6) {
                    System.out.println(nomes[i] + " - " + notas[i] + " APROVADO");
                } else {
                    System.out.println(nomes[i] + " - " + notas[i] + " REPROVADO");
                }
            }
        }

        if (encontrado) {
            System.out.println("Aluno nao encontrado.");
        }
    }
}