public class Exercicio1 {
    public static void main(String[] args) {
        double joao = 1.50, ze = 1.10;
        int anos = 0;

        while (ze <= joao) {
            joao += 0.02;
            ze += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos!");
    }
}

