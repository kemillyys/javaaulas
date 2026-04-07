public class App {

    public static void main(String[] args) throws Exception {
        Produto[] estoque = new Produto[5];

        estoque[0] = new Livros("O Senhor dos Anéis", 100.00, "Não lembro");
        estoque[1] = new CDs("CD 1", 40.00, 20);
        estoque[2] = new DVDs("DVD 1", 100, 180);
        estoque[3] = new Livros("Livro 2", 70, "Um aí");
        estoque[4] = new CDs("CD 2", 30, 10);

        System.out.println("Estoque");
        for(int i = 0; i < estoque.length; i++){
            System.out.println(estoque[i]);
        }
    }
}