public class Ave extends Animal{
    public void mover(){
        setLocalizacao(getLocalizacao() + 3);
        System.out.println("Ave: "+ getNome() + " movendo-se ^^ v ^^ -->");
    }

    public Ave(){

    }

    public Ave(String nome, int patas, double velocidade, int localizacao){
        super(nome, patas, velocidade, localizacao);
    }

    @Override
    public String toString() {
        return "Ave [getNome()=" + getNome()
                + ", getPatas()=" + getPatas()
                + ", getVelocidade()=" + getVelocidade()
                + ", getLocalizacao()=" + getLocalizacao() + "]";
    }
}
