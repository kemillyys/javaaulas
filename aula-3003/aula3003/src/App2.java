import java.util.Calendar;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        //ler dados para instanciar a classe pessoa
        System.out.println("Digite o nome da pessoa: ");
        String n = sc.next();
        //sc.next(); //limpa o buffer

        System.out.println("Digite o CPF: ");
        String cpf = sc.next();

        Pessoa p1 = new Pessoa(n, cpf); //utiliza construtor de 2 parâmetros

        //Leitura de datas com Calendar
        Calendar data = Calendar.getInstance();
        data.set(2005, 11, 10); //year, month, day

        p1.setNacimento(data);

        System.out.println(p1.toString());

        sc.close();
    }

}
