class CDs extends Produto{
    private int numFaixas;

    public CDs(){
        super();
    }

    public CDs(String nome, double valor, int numFaixas, int codigoBarras){
        super(nome, valor, codigoBarras);
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