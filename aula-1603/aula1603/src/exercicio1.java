import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int valores[] = new int[10];

        //ler valores
        for(int i = 0; i < 10; i++){
            System.out.println((i + 1) + " -Digite um número: "); //pode ser (i + " -Digite um número: ");
            valores[i] = sc.nextInt();
        }

        //exibir valores
        for(int j = 0; j < 10; j++){
            System.out.println(" - " + valores[j]);
        }

        System.out.println("\nDigite o valor mínimo: ");
        int minimo = sc.nextInt();
        System.out.println("\nDigite o valor máximo: ");
        int maximo = sc.nextInt();

        for(int x = 0; x < 10; x++){
            if (valores[x] >= minimo && valores[x] <= maximo) {
                System.out.println(" - " + valores[x]);
            }
        }

        sc.close(); //sempre no final do código
    }
}