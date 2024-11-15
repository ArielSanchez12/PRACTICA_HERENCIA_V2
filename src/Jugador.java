public class Jugador { //Clase padre
    protected String equipo; //protected para la segurdad de los atributos padre
    protected int edad;
    protected String nombre;

    public Jugador(String equipo, String nombre, int edad) { //Constructor padre
        this.equipo = equipo;
        this.edad = edad;
        this.nombre = nombre;
    }

    // metodo padre
    public void mostrarInfoPadre() {
        System.out.println("Nombre del equipo: " + equipo);
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

