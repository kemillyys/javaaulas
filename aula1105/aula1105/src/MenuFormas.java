// essa classe serve para implementar rotinas de menu

import java.util.Scanner;

public class MenuFormas {
    private Scanner sc;

    public MenuFormas(){
        sc = new Scanner(System.in);
    }

    public void encerraSistema(){
        sc.close();
    }

    public int exibirMenu(){
        String texto = "--- FORMAS 2D ---\n" +
                       "1 - Cadastrar forma \n" +
                       "2 - Listar forma \n" +
                       "3 - Calcular área \n" +
                       "0 - Sair \n" +
                       "---> Digite a opção escolhida: \n" +
                       "----------------------- \n";

        System.out.println(texto);
        return sc.nextInt();
    }

    public Forma2D cadastraForma2d(){
        System.out.println("Digite qual forma deseja cadastrar: \n" +
                           "1 - Cículo \n" +
                           "2 - Retangulo \n" +
                           "3 - Triangulo \n");
        int optionForma = sc.nextInt();
        // ler dados genéricos
        System.out.println("Digite o nome da forma: ");
        String nome = sc.next();
        System.out.println("Digite a altura da forma: ");
        double altura = sc.nextDouble();
        System.out.println("Digite a largura da forma: ");
        double largura = sc.nextDouble();
        // Usa dados para construir forma específica
        
        switch (optionForma) {
            case 1:
                Circulo c = new Circulo(altura, nome);
                return c; 
                //break; //todo case q tem return n precisa de break, pq ele encerra a função lá

            case 2:
                if(altura == largura){
                    Retangulo r = new Retangulo(largura);
                    return r;
                }else{
                    Retangulo r = new Retangulo(altura, largura);
                    return r;
                }

            case 3:
                System.out.println("Digite o estilo do triângulo: ");
                String estilo = sc.next();
                Triangulo t = new Triangulo(estilo, altura, largura);
                return t;
        
            default:
                break;
        }

        return null;
    }
}
