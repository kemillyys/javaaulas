import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        double nota1, nota2, nota3, media;

        System.out.println("Informe o código do aluno (informe 0 para sair)");
        codigo = scanner.nextInt();

        while (codigo != 0) {
            System.out.printf("Informe a nota 1: ");
            nota1 = scanner.nextDouble();

            System.out.printf("Informe a nota 2: ");
            nota2 = scanner.nextDouble();

            System.out.printf("Informe a nota 3: ");
            nota3 = scanner.nextDouble();

            media  = (nota1 + nota2 + nota3) / 3.0;
            System.out.printf("Média do aluno: %.2f\n", media);

            System.out.println("Informe o código do próximo aluno (0 para sair): ");
            codigo = scanner.nextInt();
        }

        System.out.println("Encerrando programa...");
        scanner.close();
    }
}
