public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    void mostrarDados() {
        String status = this.estaNaEmpresa ? "Sim" : "Não";

        String ficha = """
                -----------------------------------
                       FICHA DO FUNCIONARIO
                -----------------------------------
                | Nome: %s
                | Departamento: %s
                | Salario: R$ %.2f
                | Data de Entrada: %s
                | RG: %s
                | Ativo na Empresa: %s
                -----------------------------------
                """;

        System.out.printf(ficha, this.nome, this.departamento, this.salario, this.dataEntrada, this.rg, status);
    }

    void bonifica(double valor) {
        this.salario += valor;
    }

    void demite() {
        this.estaNaEmpresa = false;
    }
}
