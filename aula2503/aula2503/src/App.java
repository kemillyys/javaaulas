import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- SISTEMA BANCÁRIO ----- \n");
        // Declarando e instanciando um obj da classe Conta
        Conta conta1 = new Conta(); 
        // Editando atributos do obj
        sc.reset();

        System.out.println("Digite o nome do cliente: ");
        String n = sc.nextLine(); // lendo o nome do teclado
        conta1.setNome(n); //usando set
        conta1.setNumero(2); //public
        System.out.println("O nome digitado é: "+ conta1.getNome());

        //System.out.println("Digite o número da conta");
        //conta1.numero = sc.nextInt();

        System.out.println("Digite o saldo da conta");
        //conta1.setSaldo(1000);

        //System.out.println("Digite o limite da conta");
        //conta1.limite = sc.nextDouble();

        // Executando o método saque
        System.out.println("--- SAQUE ----");
        System.out.println("Digite o valor de saque");
        double valor = sc.nextDouble();

        // conta1.saque(valor);
        if(conta1.sacarVerfica(valor)){
            System.out.println("saque realizado com sucesso.");
        }else{
            System.out.println("Erro ao relizar o saque");
        }
        System.out.println(conta1.toString());

        //conta 2
        Conta conta2 = new Conta();
        conta2.setNumero(6);

        //visualiza contas
        System.out.println(conta1.toString());
        
        System.out.println(conta2.toString());

        Conta conta3 = new Conta();
        System.out.println(conta3.toString());

        sc.close(); // fechar o scanner
    }
}