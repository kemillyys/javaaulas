public class Atividade1 {
    public static void main(String args[]){
        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;

        j++;
        ++i;

        x = i++ + j;
        y = ++j + ++i;

        System.out.println("Valor de X: " + x);
        System.out.println("Valor de Y: "+ y);
    }
}
