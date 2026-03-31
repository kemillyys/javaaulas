/*

Crie uma classe para representar uma pseudo calculadora, que possui dois
números inteiros como atributos. Nessa classe, os dois atributos devem ser
privados. Por isso, criem também os métodos que irão acessar os atributos
(getters e setters). Crie também métodos para realizar as seguintes
operações com os dois atributos: soma, subtração, divisão e mulLplicação.
Crie também uma outra classe, que possui um método principal e que
instancie um objeto da classe criada, e que realiza as operações
disponibilizadas pelo objeto.

*/

public class Calculadora{
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1(){
        return this.num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum2(){
        return this.num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int somar() {
        return num1 + num2;
    }

    public int subtrair() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 == 0) {
            System.out.println("Erro!");
            return 0;
        }

        return (double) num1 / num2;
    }
}
