class Produto {
    private String nome;
    private double preco;
    private int codigoBarras;

    public Produto(){

    }

    public Produto(String nome, double preco, int codigoBarras){
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getCodigoBarras(){
        return this.codigoBarras;
    }
    public void setCodigoBarras(int codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Produto){
            Produto outro = (Produto) obj;
            return this.codigoBarras == outro.codigoBarras;
        }
        return false;
    }

    public String toString(){
        return "Nome: " + nome
               + " Preço: " + preco
               + " Código de barras: " + codigoBarras;
    }
}