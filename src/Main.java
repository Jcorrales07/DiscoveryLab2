import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Lista para guardar los animales
    public static ArrayList<Animal> listAnimales = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Animales default
        animalesDefault();
        do {
            switch (menu()) {
                case 1:
                    registrarAnimal();
                    break;
                case 2:
                    editarAnimal(cadena("Ingrese el nombre cientifico: "));
                    break;
                case 3: {
                    int opcion = numero("\nOpciones:" +
                            "\n1. Imprimir por posicion de la lista" +
                            "\n2. Imprimir lista completa" +
                            "\n3. Imprimir por nombre cientifico" +
                            "\nOPCION#");
                    switch (opcion) {
                        case 1:
                            imprimirPosLista();
                            break;
                        case 2:
                            imprimirListCompleta();
                            break;
                        case 3:
                            imprimirXNomCientifico(cadena("Ingrese el nombre cientifico: "));
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                }   break;

                case 4:
                    alimentar();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while(true);
    }

    public static int menu() {
        return numero("\n\n[=== MENU ===]" +
                "\n1. Registrar animal" +
                "\n2. Editar animal" +
                "\n3. Imprimir animal" +
                "\n4. Alimentar animal" +
                "\n0. Salir" +
                "\nOPCION#");
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
        while(vida == 0) {
            System.out.println("No se acepta la 0 de vida, vuelva a registrar");
            vida = numero("Años de vida: ");
        }
            listAnimales.add(new Animal(nCientifico, nComun, habitat, alimentacion, desAnimal, disGeo, vida));
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
        switch (opcion) {
            case 1:
                editarUnAtributo(numero("Ingrese la posicion: "));
                break;
            case 2:
                editarTodosAtributos();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }

    //Funcion para editar solo un atributo
    public static void editarUnAtributo(int pos) {
        int opcion = numero("\nOpciones: " +
                "\n1. Nombre Cientifico" +
                "\n2. Nombre Comun" +
                "\n3. Habitat" +
                "\n4. Alimentacion" +
                "\n5. Descripcion del animal" +
                "\n6. Distribucion Geografica" +
                "\n7. Vida" +
                "\nOPCION# ");


        switch (opcion) {
            case 1:
                listAnimales.get(rst(pos)).setNombreCientifico(cadena("Nombre Cientifico: "));
                break;
            case 2:
                listAnimales.get(rst(pos)).setNombreComun(cadena("Nombre Comun: "));
                break;
            case 3:
                listAnimales.get(rst(pos)).setAlimentacion(cadena("Alimentacion: "));
                break;
            case 4:
                listAnimales.get(rst(pos)).setDescripAnimal(cadena("Descripcion de Rasgos: "));
                break;
            case 5:
                listAnimales.get(rst(pos)).setHabitat(cadena("Habitat: "));
                break;
            case 6:
                listAnimales.get(rst(pos)).setDisGeo(cadena("Ubicacion Geograficas: "));
                break;
            case 7:
                listAnimales.get(rst(pos)).setVida(numero("Vida: "));
                break;
        }
    }

    //Funcion para cambiar todos los atributos
    public static void editarTodosAtributos() {
        int pos = numero("Ingrese la posicion: ");
        String nCientifico = cadena("Nombre Cientifico: ");
        listAnimales.get(rst(pos)).setNombreCientifico(nCientifico);
        String nComun = cadena("Nombre Comun: ");
        listAnimales.get(rst(pos)).setNombreComun(nComun);
        String habitat = cadena("Habitat: ");
        listAnimales.get(rst(pos)).setHabitat(habitat);
        String alimentacion = cadena("Alimentacion: ");
        listAnimales.get(rst(pos)).setAlimentacion(alimentacion);
        String desAnimal = cadena("Descripcion Del Animal: ");
        listAnimales.get(rst(pos)).setDescripAnimal(desAnimal);
        String disGeo = cadena("Distribucion Geografica: ");
        listAnimales.get(rst(pos)).setDisGeo(disGeo);
        int vida = numero("Años de vida: ");
        listAnimales.get(rst(pos)).setVida(vida);
    }

    //Funcion para imprimir solo el de la posicion especificada
    public static void imprimirPosLista() {
        int posicion = numero("Ingrese la posicion a imprimir: ");
        System.out.println(listAnimales.get(rst(posicion)).toString());
    }

    //Funcion para imprimir toda la lista
    public static void imprimirListCompleta() {
        for (int i = 0; i < listAnimales.size(); i++)
            System.out.println("\n"+(i+1)+ ". "+listAnimales.get(i).toString());
    }

    //Funcion para imprimir por nombre cientifico
    public static void imprimirXNomCientifico(String nCientifico) {
        for (Animal animal : listAnimales) {
            if (nCientifico.equalsIgnoreCase(animal.getNombreCientifico()))
                System.out.println(animal);
        }
    }

    //Funcion para alimentar
    public static void alimentar() {
        int pos0 = numero("Ingrese la posicion del animal a alimentar: ");
        int pos1 = numero("Ingrese la posicion del animal a devorar: " );
        listAnimales.get(rst(pos0)).setVida((listAnimales.get(rst(pos0)).getVida() + listAnimales.get(rst(pos1)).getVida()));
        listAnimales.remove(rst(pos1));
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

    //Funcion para restar una posicion
    public static int rst(int pos) {
        if (pos == 1) pos = 0;
        else pos--;
        return pos;
    }
}
