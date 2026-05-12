import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //Forma2D novaForma = new Forma2D(6.5, 5.0, "retangulo"); // Não pode instanciar classes abstratas
        //Triangulo trianguloRetangulo = new Triangulo(5.0,"Triangulo", "retangulo");
        // Usando a implementação do método abstrato area() da superclasse
        //System.out.println(trianguloRetangulo.area());

        //Retangulo retangulo = new Retangulo(4.0);
        // Usando a implementação do método abstrato area() da superclasse
        //System.out.println(retangulo.area());

        ArrayList<Forma2D> listaFormas = new ArrayList<>();
        int option = 0;
        MenuFormas menuFormas = new MenuFormas();
        do{
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1:
                    listaFormas.add(menuFormas.cadastraForma2d());
                    break;

                case 2:
                    for (Forma2D forma2d : listaFormas) {
                        System.out.println(forma2d.toString());
                    }
                    break;
            
                case 3:
                    for (Forma2D forma2d : listaFormas) {
                        System.out.println("Área da forma " + forma2d.getNome() +
                                           ": " + forma2d.area());
                    }
                    break;

                default:
                    break;
            }

        }while(option != 0);
        menuFormas.encerraSistema(); //encerra o scanner

    }
}
