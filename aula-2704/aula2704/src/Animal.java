public class Animal {
    private String nome;
    private int patas;
    private double velocidade;
    private int localizacao;

    public Animal() {}

    public Animal(String nome, int patas, double velocidade) {
        this.nome = nome;
        this.patas = patas;
        this.velocidade = velocidade;
        this.localizacao = 0;
    }

    public Animal(String nome, int patas, double velocidade, int localizacao) {
        this.nome = nome;
        this.patas = patas;
        this.velocidade = velocidade;
        this.localizacao = localizacao;
    }

    public String getNome() { return nome; }
    public int getPatas() { return patas; }
    public double getVelocidade() { return velocidade; }
    public int getLocalizacao() { return localizacao; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPatas(int patas) { this.patas = patas; }
    public void setVelocidade(double velocidade) { this.velocidade = velocidade; }
    public void setLocalizacao(int localizacao) { this.localizacao = localizacao; }

    public void mover() {
        System.out.println("Animal --------->");
        this.localizacao++;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() 
            + " | Patas: " + getPatas() 
            + " | Vel: " + getVelocidade() 
            + " | Loc: " + getLocalizacao();
    }
}