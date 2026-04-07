class Livros extends Produto {
    private String autor;

    public Livros(){
        super();
    }
    
    public Livros(String nome, double preco, String autor, int codigoBarras){
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String toString(){
        return super.toString() + " Autor: " + autor;
    }
}