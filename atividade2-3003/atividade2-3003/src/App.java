public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculo = new Calculadora(0, 0);

        calculo.setNum1(10);
        calculo.setNum2(5);

        System.out.println("Soma: " + calculo.somar() + "\nSubtração: " + calculo.subtrair() + "\nMultiplicação: " + calculo.multiplicar() + "\nDivisão: " + calculo.dividir());
        
    }
}
