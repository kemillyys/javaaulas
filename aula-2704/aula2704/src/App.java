//IMPLEMENTE O MENU DA APLICAÇÃO
        /*
        1- CADASTRAR ANIMAIS
        2- LISTAR ANIMAIS
        3- MOVER ANIMAL
            - QUAL ANIMAL DESEJA MOVER?
        4- EDITAR ANIMAL
            - QUAL ANIMAL DESEJA EDITAR?
        0- SAIR
        */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Animal[] animais = new Animal[10];
        ArrayList<Animal> animaisList = new ArrayList<>();

        System.out.println("\n POLIMORFISMO com animais\n");

        String menu = "1- CADASTRAR ANIMAIS\n" +
                      "2- LISTAR ANIMAIS\n" +
                      "3- MOVER ANIMAL\n" +
                      "4- EDITAR ANIMAL\n" +
                      "0- SAIR\n Digite sua opção: \n";

        //int qtdCadastros = 0; // contador de cadastros
        int op = 0;

        do{
            System.out.println(menu);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de animais: ");
                    System.out.println("Escolha qual animal deseja cadastrar \n" 
                    + "1- animal genérico\n"
                    + "2- Peixe\n"
                    + "3- Ave\n");
                    int tipoAnimal = sc.nextInt();

                    //especificidades
                    System.out.println("Digite o nome do animal: ");
                    String nome = sc.next();

                    System.out.println("Digite a quantidade de patas do animal: ");
                    int patas = sc.nextInt();

                    System.out.println("Digite a velocidade do animal: ");
                    double velocidade = sc.nextDouble();

                    System.out.println("Digite um valor inteiro de localização: ");
                    int localizacao = sc.nextInt();

                    switch (tipoAnimal) {
                        case 1:
                            Animal a = new Animal(nome, patas, velocidade, localizacao);
                            animaisList.add(a);
                            break;
                    
                        case 2:
                            System.out.println("Qual o tipo de água?\n 0- Doce \n 1- Salgada\n");
                            int agua = sc.nextInt();
                            Peixe p = new Peixe(nome, patas, velocidade, agua);
                            animaisList.add(p);
                            break;
                        
                        case 3:
                            Ave ave = new Ave(nome, patas, velocidade, localizacao);
                            animaisList.add(ave);
                            break;

                        default:
                            break;
                    }
                    System.out.println("Temos " + animaisList.size() + " animais cadastrados. \n");
                    
                    break;
            
                case 2:
                    System.out.println("Listar animais: ");
                    for(Animal animalItem : animaisList){
                        System.out.println(animalItem.toString());
                    }
                    break;

                case 3:
                    System.out.println("Mover animal: ");
                    for(Animal a : animaisList){
                        a.mover();
                    }

                    // ----- TENTAR FAZER MOVER APENAS 1 ANIMAL, POIS DA FORMA Q ESTÁ ELE FAZ MOVER TODOS -----
                    break;

                case 4:
                    System.out.println("Editar animal: ");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema!");

                default:
                    break;
            }

        }while (op != 0);

        sc.close();
    }
}
