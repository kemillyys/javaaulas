public class Anfibio extends Animal {

    public Anfibio(String nome, int patas, double velocidade) {
        super(nome, patas, velocidade);
    }

    @Override
    public void mover() {
        System.out.println("Anfíbio _ _ _ _>\n");
        super.setLocalizacao(1); 
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
