import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1[] = new int[10];
        int num2[] = new int[10];
        //int num3[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Informe o valor " + (i + 1));
            num1[i] = sc.nextInt();
        }

        for(int j = 0; j < 10; j++){
            System.out.println("Informe o valor " + (j + 1));
            num2[j] = sc.nextInt();
        }

        /*for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                if(num1[i] == num2[j]){
                    num3
                }
            }
        }*/

        sc.close();
    }
}
