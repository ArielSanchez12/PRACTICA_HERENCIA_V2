public class Defensa extends Jugador {//Subclase Defensa
    private int bloqueos; //atributos propios

    //Aqui tambien le cambie los nombres para diferenciar
    public Defensa(String equipo, String nombreDefensa, int edadDefensa, int bloqueos) {
        super(equipo, nombreDefensa, edadDefensa); //Lo mismo que hice arriba
        this.bloqueos = bloqueos;
    }

    public int Bloqueos(int bloqueos) {//Metodos propios de la subclase Defensa
        return bloqueos;
    }

    @Override //Y sobreescribimos para agregar el metodo propio
    public void mostrarInfoPadre() {
        super.mostrarInfoPadre();
        System.out.println("Bloqueos: " + Bloqueos(bloqueos) + "\n"); //Lo agregamos
    }
}
