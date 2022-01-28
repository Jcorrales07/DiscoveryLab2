import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Lista para guardar los animales
    public static ArrayList<Animal> listAnimales = new ArrayList<>();


    public static void main(String[] args) {
        //PRUEBAS
        registrarAnimal();
        System.out.println("Completo");
        imprimirListCompleta();
        System.out.println("Individual");
        imprimirPosLista();
        System.out.println("NCientifico");
        imprimirXNomCientifico(cadena("Ingrese el nombre cientifico: "));
    }

    //Funcion para registrar un animal
    public static void registrarAnimal() {
        String nCientifico = cadena("Nombre Cientifico: ");
        String nComun = cadena("Nombre Comun: ");
        String habitat = cadena("Habitat: ");
        String alimentacion = cadena("Alimentacion: ");
        String desAnimal = cadena("Descripcion Del Animal: ");
        String disGeo = cadena("Distribucion Geografica: ");
        int vida = numero("Años de vida: ");
        listAnimales.add(new Animal(nCientifico, nComun, habitat, alimentacion, desAnimal, disGeo, vida));
        animalesDefault();
    }

    //Funcion que genera 3 animales por default
    public static void animalesDefault() {
        listAnimales.add(new Animal("Rattus", "Rata", "Bosques lluviosos", "frutos", "roedor de mediano tamaño", "Todos los paises", 2));
        listAnimales.add(new Animal("Felis silvestris catus", "Gato", "Montaña", "carne", "Mamifero de 50 cm de largo y 20 cm altura, 4 patas, cola y suave pelaje", "Todos los paises", 5));
        listAnimales.add(new Animal("Gallus gallus domesticus", "Gallina", "Praderas", "cereales: maiz, trigo, cebada y avena", "ave con alas cortas, pico corto y algo curvado", "sudeste asiático", 6));
    }

    //Funcion para editar un animal PENDIENTE
    public static void editarAnimal(String nCientifico) {
        int opcion = numero("OPCIONES: " +
                "\n1) Editar un atributo" +
                "\n2) Editar todos los atributos" +
                "\nOPCION #");
    }

    //Funcion para imprimir solo el de la posicion especificada
    public static void imprimirPosLista() {
        int posicion = numero("Ingrese la posicion a imprimir: ");
        if (posicion == 1) posicion = 0;
        else posicion--;
        System.out.println(listAnimales.get(posicion).toString());
    }

    //Funcion para imprimir toda la lista
    public static void imprimirListCompleta() {
        for (int i = 0; i < listAnimales.size(); i++)
            System.out.println((i+1)+ ". "+listAnimales.get(i).toString());
    }

    //Funcion para imprimir por nombre cientifico
    public static void imprimirXNomCientifico(String nCientifico) {
        for (Animal animal : listAnimales) {
            if (nCientifico.equals(animal.getNombreCientifico()))
                System.out.println(animal);
        }
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
