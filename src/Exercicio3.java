import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, maior = 0, menor = 0, soma = 0;
        double media;

        for(int i = 1; i <= 5; i++){
            System.out.println("Informe o " + i + " valor inteiro positivo: ");
            numero = scanner.nextInt();

            if(i == 1){
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior){
                    maior = numero;
                }
                if (numero < menor){
                    menor  = numero;
                }
            }

            soma += numero;
        }

        media = (double)soma / 5;

        System.out.println("Maior número: "+ maior);
        System.out.println("Menor número: "+ menor);
        System.out.println("Média dos números: "+ media);

        scanner.close();
    }
}
