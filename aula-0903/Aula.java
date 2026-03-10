import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in); //inicia o leitor
        System.out.println("Digite um número: "); //le o teclado
        int numero = input.nextInt();
        System.out.println("Você digitou o número "+ numero +"!!"); //devolve o valor lido

        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        System.out.println("Você digitou o número "+ numero2 + "!!");

        int soma = numero + numero2;

        System.out.println("Resultado do numero 1 + numero 2: "+ soma);

        input.close(); //fecha o leitor no fim do programa
    }
}
