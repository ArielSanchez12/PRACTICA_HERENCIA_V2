public class Portero extends Jugador { //Subclase Portero
    private int atajadas; //Tiene sus atributos propios
    private int golesRecibidos;
    private int numCamiseta; //Agregamos un nuevo atributo

    //Aca solo le cambie el nombre (no confundirse) a los argumentos para que no salgan todos con el mismo nombre y edad
    public Portero(String equipo, String nombrePortero, int edadPortero, int atajadas, int golesRecibidos, int numCamiseta) { //Su constructor que usa los atributos heredados del padre
        super(equipo, nombrePortero, edadPortero); //Estos son los heredados
        //Cuando queramos heredar metodos especificos(NO TODOS) podemos usar la siguiente linea
        //super.NombreMetodoEspecifico();
        //En este caso no usé esa linea porque el metodo que necesitamos del padre es uno solo y sera el mismo para todos
        this.atajadas = atajadas; //Ademas uso el this. para asignar los valores a los atributos propios
        this.golesRecibidos = golesRecibidos;
        this.numCamiseta = numCamiseta; //Agregamos el nuevo atributo
    }

    public int Atajadas(int atajadas) { //Metodos propios de la subclase Portero
        return atajadas;
    }

    public int GolesRecibidos(int golesRecibidos) { //Lo mismo de arriba
        return golesRecibidos;
    }

    public int NumCamiseta(int numCamiseta) { //Metodo para el atributo nuevo
        return numCamiseta;
    }
    @Override //Sobreescribir
    public void mostrarInfoPadre() { //Sobreescribimos al metodo del padre
        super.mostrarInfoPadre(); //Hacemos referencia al metodo del padre
        System.out.println("Atajadas: " + Atajadas(atajadas)); //Y le agregamos los metodos propios de
        System.out.println("Goles recibidos: " + GolesRecibidos(golesRecibidos) + "\n"); //la subclase Portero
        System.out.println("Numero de camiseta: " + NumCamiseta(numCamiseta)); //Sobre escribo tambien el nuevo metodo
    }
}
