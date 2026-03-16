import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10]; 
        int minimo, maximo, quantidadeEncontrada = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o "+ (i + 1) + " º numero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Valores inseridos: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + "");
        }
        System.out.println("\n");

        System.out.println("Valor mínimo: ");
        minimo = scanner.nextInt();

        System.out.println("Valor máximo a ser buscado: ");
        maximo = scanner.nextInt();

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > minimo && numeros[i] < maximo){
                System.out.println("\nValor encontrado: " + numeros[i]);

                quantidadeEncontrada++;
            }
        }
        if(quantidadeEncontrada == 0){
            System.out.println("\nNenhum valor encontrado entre " + minimo + " e " + maximo);
        }

        scanner.close();
    }
}