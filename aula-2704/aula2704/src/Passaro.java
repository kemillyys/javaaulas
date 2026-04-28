public class Passaro extends Animal {

    public Passaro(String nome, int patas, double velocidade) {
        super(nome, patas, velocidade);
    }

    @Override
    public void mover() {
        System.out.println("'''''''''''''''''''''''''>");
        super.setLocalizacao(1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

