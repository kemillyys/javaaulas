public class Peixe extends Animal {
    private int agua;

    public Peixe(String nome, int patas, double velocidade, int agua) {
        super(nome, patas, velocidade);
        this.agua = agua;
    }

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua) {
        super(nome, patas, velocidade, localizacao);
        this.agua = agua;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua == 0 || agua == 1) {
            this.agua = agua;
        } else {
            System.out.println("Erro: Use 0 (Doce) ou 1 (Salgada).");
        }
    }

    @Override
    public void mover() {
        System.out.println("Peixe . .. .. ...>\n");
    }

    @Override
    public String toString() {
        return "Peixe [agua=" + agua + ", getAgua()=" + getAgua() 
                + ", getNome()=" + getNome() 
                + ", getPatas()=" + getPatas() 
                + ", getVelocidade()=" + getVelocidade() 
                + ", getLocalizacao()=" + getLocalizacao() + "]";
    }
}