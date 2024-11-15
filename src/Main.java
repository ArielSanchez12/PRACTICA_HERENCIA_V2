import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo: "); //Entrada por teclado de cada posicion
        String equipo = scanner.nextLine();
        System.out.println("Ingrese el nombre del Portero: ");
        String nombrePortero = scanner.nextLine();
        System.out.println("Ingrese la edad del Portero: ");
        int edadPortero = scanner.nextInt();
        System.out.println("Ingrese las atajadas realizadas por el portero: ");
        int atajadas = scanner.nextInt();
        System.out.println("Ingrese los goles recibidos por el portero: ");
        int golesRecibidos = scanner.nextInt();
        System.out.println("Ingrese el numero de la camiseta del portero: ");
        int numCamiseta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n");
        System.out.println("Ingrese el nombre del Defensa: "); //Con  sus respectivas variables
        String nombreDefensa = scanner.nextLine();
        System.out.println("Ingrese la edad del Defensa: "); //edad'DEFENSA'
        int edadDefensa = scanner.nextInt();
        System.out.println("Ingrese el numero de bloqueos realizados por el defensa: ");
        int bloqueos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n");
        System.out.println("Ingrese el nombre del Delantero: ");//Igual aca
        String nombreDelantero = scanner.nextLine();
        System.out.println("Ingrese la edad del Delantero: ");
        int edadDelantero = scanner.nextInt();
        scanner.nextLine();

        //Instanciamos cada subclase e imprimimos la informacion
        Portero portero = new Portero(equipo, nombrePortero, edadPortero, atajadas,golesRecibidos, numCamiseta);
        System.out.println("\nInformacion del Portero"); //Para que se vea mas ordenado
        portero.mostrarInfoPadre();
        Defensa defensa = new Defensa(equipo, nombreDefensa, edadDefensa, bloqueos);
        System.out.println("\nInformacion del Defensa");
        defensa.mostrarInfoPadre();
        Delantero delantero = new Delantero(equipo, nombreDelantero, edadDelantero);
        System.out.println("Informacion del Delantero");
        delantero.mostrarInfoPadre();
    }
}
