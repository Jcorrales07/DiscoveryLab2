import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Lista para guardar los animales
    public static ArrayList<Animal> listAnimales = new ArrayList<>();


    public static void main(String[] args) {

        registrarAnimal();
    }

    public static void registrarAnimal() {
        String nCientifico = cadena("Nombre Cientifico: ");
        String nComun = cadena("Nombre Comun: ");
        String habitat = cadena("Habitat: ");
        String alimentacion = cadena("Alimentacion: ");
        String desAnimal = cadena("Descripcion Del Animal: ");
        String disGeo = cadena("Distribucion Geografica: ");
        int vida = numero("Años de vida: ");
        listAnimales.add(new Animal(nCientifico, nComun, habitat, alimentacion, desAnimal, disGeo, vida));
    }

    //Funcion para pedir un String
    public static String cadena(String mensaje) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.print(mensaje);
        String cadena = input.next();
        return cadena;
    }

    //Funcion para pedir un numero
    public static int numero(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.nextInt();
    }
}
