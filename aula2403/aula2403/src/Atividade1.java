class Funcionario {
    String nome;
    String departamento;
    Double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    void bonifica(double valor){
        salario += valor;
    }

    void demite(){
        estaNaEmpresa = false;
    }
}

public class Atividade1 {
    public static void main (String[] args){
        Funcionario f1 = new Funcionario();

        f1.nome = "Kemilly";
        f1.departamento = "TI";
        f1.salario = 3000.0;
        f1.dataEntrada = "24/03/2026";
        f1.rg = "12.345.678-9";
        f1.estaNaEmpresa = true;

        System.out.println("Salário inicial: "+ f1.salario);

        f1.bonifica(500);

        System.out.println("Novo Salário: "+ f1.salario);
        System.out.println("Ainda trabalha aqui: "+ f1.estaNaEmpresa);

        f1.demite();

        System.out.println("Trabalha na empresa após demite? "+ f1.estaNaEmpresa);
    
    }
    
}


    

