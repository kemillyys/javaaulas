public class exemplo{
    public static void main(String[] args){

        System.out.println("Olá Mundo!");

        // o código vai aqui
        String texto1 = ">> O operador de concatenação (+) ";
        String texto2 = "é muito prático";
        String texto3 = texto1 + texto2 + "!";

        System.out.println(texto3 + ">>");
        System.out.println(">> 2 + 5 = " + 2 + 5); //incorreto
        System.out.println(">> 2 + 5 = " + (2 + 5)); //correto
    }
}

/*
Para executar
javac Arquivo.java (javac exemplo.java)
java Arquivo  (java exemplo)
*/