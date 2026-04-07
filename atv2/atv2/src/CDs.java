class CDs extends Produto{
    private int numFaixas;

    public CDs(){
        super();
    }

    public CDs(String nome, double valor, int numFaixas){
        super(nome, valor);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas(){
        return this.numFaixas;
    }
    public void setNumFaixas(int numFaixas){
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString(){
        return super.toString() + " Número de faixas: "+ numFaixas;
    }
}