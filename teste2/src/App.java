public class App {

    public static void buscarProduto(Produto busca, Produto[] vetor) {
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(busca)){
                System.out.println("Produto encontrado na posição: " + i);
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }
    public static void main(String[] args) throws Exception {
        Produto[] estoque = new Produto[5];

        estoque[0] = new Livros("O Senhor dos Anéis", 100.00, "Não lembro", 12345);
        estoque[1] = new CDs("CD 1", 40.00, 20, 1234567);
        estoque[2] = new DVDs("DVD 1", 100, 180, 123456);
        estoque[3] = new Livros("Livro 2", 70, "Um aí", 123450);
        estoque[4] = new CDs("CD 2", 30, 10, 12345678);

        System.out.println("Estoque");
        for(int i = 0; i < estoque.length; i++){
            System.out.println(estoque[i]);
        }

        System.out.println("\nBusca");
        Produto pIgual = new Livros("Harry Potter", 100.0, "nao lembro", 12345);
        System.out.print("Código 12345: ");
        buscarProduto(pIgual, estoque);

        Produto pDiferente = new Livros("Outro Livro", 10.0, "Alguém", 101010);
        System.out.print("Código 101010: ");
        buscarProduto(pDiferente, estoque);
    }
}