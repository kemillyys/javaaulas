class DVDs extends Produto{
    private double duracao;

    public DVDs(){
        super();
    }
    public DVDs(String nome, double preco, double duracao, int codigoBarras){
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    public double getDuracao(){
        return this.duracao;
    }
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return super.toString() + " Duracao: " + duracao;
    }
}