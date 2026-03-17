import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine(); //ler string

        System.out.println("Você digitou um texto com " + nome.length() + " caracteres");

        System.out.println("Digite outro nome: ");
        String nome2 = sc.nextLine();
        if(nome.equalsIgnoreCase(nome2)){ //nome.equals(nome2)
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!!");
        }

        String textoQuebrado[] = nome.split(",");
        System.out.println("Texto quebrado: " + textoQuebrado[0]);
        System.out.println("Tamanho do array: " + textoQuebrado[0]);

        sc.close();
    }
}