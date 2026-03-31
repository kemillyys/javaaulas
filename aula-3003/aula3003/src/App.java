public class App {
    public static void main(String[] args) throws Exception{
        Carro car = new Carro("Gol", "preto", "AAA3E34", 2); //utilizando construtor cheio

        System.out.println(car.toString());

        Carro car2 = new Carro(); // utilizando construtor vazio
    }
}