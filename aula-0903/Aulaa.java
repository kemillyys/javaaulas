import javax.swing.JOptionPane;

public class Aulaa {
    public static void main(String[] args) {
        int num1 = 0;
        while(num1 < 10){
            System.out.println("- " + (num1++));
        }

        int num2 = 0;
        while (num2 < 10 && num2 > -5 && num2 != 10) {
            num2 = 11;
            System.out.println(" * "+ num2);
        }

        int num3 = 0, soma = 0;
        do{
            num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor?"));
            soma += num3;
        } while(num3 > 0);
        System.out.println("Soma total: "+ soma);

        for(int cont = 0; cont <= 10; cont++){
            System.out.println(cont);
        }

    }
}
