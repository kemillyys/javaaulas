import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        FileReader fl = new FileReader("src/cadastro_pessoas.csv");
        BufferedReader br = new BufferedReader(fl);
        String line = null;
        br.readLine(); //descarta linha 1
        while ((line = br.readLine()) != null) {
            String dados[] = line.split(",");
            Pessoa p = new Pessoa(dados[0], dados[1], dados[2]);
            pessoas.add(p);
        }
        br.close();

        System.out.println(pessoas.size() + " pessoas cadastradas no sistema!");
        //Escrita em arquivo
        Pessoa p2 = new Pessoa("Odete 2 da Silva", "203.550.795-28", "23/01/1980");
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/cadastropessoas.csv", true));

        bw.newLine();
        bw.write(p2.escreveObjetoCsv());
        bw.close();
        // tentar serparar isso em classe
    
        //---------------------------------------------------------------------
        //Pessoa p1 = new Pessoa("Kemilly", "100000000", "10/11/2005");
        //Pessoa p2 = new Pessoa("Adriano", "200000000", "11/11/2006");
        //Pessoa p3 = new Pessoa("Julia", "300000000", "12/11/2007");
        //pessoas.add(p1);
        //pessoas.add(p2);
        //pessoas.add(p3);

        //System.out.println("Array sem ordenação: \n"+ pessoas);
        //Collections.sort(pessoas);
        //System.out.println("Array ordenado: \n"+ pessoas);

        //busca binária
        //Pessoa p4 = new Pessoa("Adriano", "400000000", "13/11/2008");
        //System.out.println("Buscar nome " + 
                            //p4.getNome() + 
                           // ": " + 
                            //Collections.binarySearch(pessoas, p4));

        //Pessoa p5 = new Pessoa("João", "500000000", "14/11/2009");
        //Pessoa p6 = new Pessoa("Katia", "600000000", "15/11/2010");
        //Pessoa p7 = new Pessoa("Elisangela", "700000000", "16/11/2011");

        //ArrayList<Pessoa> pessoas2 = new ArrayList<>();
        //pessoas2.add(p5);
        //pessoas2.add(p6);
        //pessoas2.add(p7);

        //Collections.sort(pessoas2);
        // busca disjunção nos arrays
        //System.out.println("Conjuntos disjuntos? " + 
                            //Collections.disjoint(pessoas, pessoas2));
        //pessoas2.add(p1);
        //System.out.println("(dps de add p1) Conjuntos disjuntos? " + 
                            //Collections.disjoint(pessoas, pessoas2));

        //System.out.println("Frequência de nome: " + 
                            //p1.getNome() + 
                            //Collections.frequency(pessoas, p1));

        //Collections.reverse(pessoas2);
        //System.out.println("Array após Collection.reverse: " + pessoas2);
    }
}
        
