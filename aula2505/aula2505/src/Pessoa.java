public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String cpf;
    private String dataNascimento;

    // construtores
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return nome + "," + cpf + "," + dataNascimento;
    }

    public String escreveObjetoCsv(){
        return nome + "," + cpf + "," + dataNascimento;
    }
    public int compareTo(Pessoa outra){
        return this.nome.compareTo(outra.nome);
    }
    
}
