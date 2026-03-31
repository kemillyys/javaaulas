public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int portas;

    public Carro(){
        //construtor vazio
    }

    public Carro(String tipo,  String cor, String placa, int portas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.portas = portas;
    }

    // get e set
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getPortas(){
        return portas;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }

    public String toString(){
        return "--- Carro ---\n"
                +"Tipo: " + this.tipo
                + "\n Cor: "+ this.cor
                + "\n Placa: "+ this.placa
                + "\n Portas: "+ this.portas;
    }
}

