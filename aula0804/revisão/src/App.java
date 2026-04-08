import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sistema bancário ---");
        Cliente cliente1 = new Cliente("Kemilly", "Ribeiro", "123.546.789-10");
        Conta conta1 = new Conta(/*"Kemilly"*/0, 1000, 10000);
        Conta conta2 = new Conta();

        System.out.println(conta1.toString());
        System.out.println(cliente1.toString());
        System.out.println(conta2.toString());

        sc.close();
    }
}
