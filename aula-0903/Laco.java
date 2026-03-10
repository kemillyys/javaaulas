public class Laco {
    public static void main(String[] args) {
        String nomes[] = {"Joao", "Maria", "José"};
        String procura = "José";
        boolean encontrou = false;

        for(int i = 0; i <nomes.length; i++){
            if (nomes[i].equals(procura)) {
                encontrou = true;
                break;
            }
            System.out.println(" Visitamos este lugar!");
        }
        if (encontrou)
            System.out.println(procura + " encontrado!");
        else System.out.println(procura + "NAO encontrado");
    }
}
