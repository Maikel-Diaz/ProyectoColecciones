import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class TiendaVideojuegos here.
 * 
 * @author (Maikel) 
 * @version (a version number or a date)
 */
public class TiendaVideojuegos
{
    // instance variables - replace the example below with your own
    private ArrayList<Videojuegos> listaDeVideojuegos;
    private int codVideojuego;
    /**
     * Constructor de la clase TiendaVideojuegos
     */
    public TiendaVideojuegos()
    {
        listaDeVideojuegos = new ArrayList<Videojuegos>();
        codVideojuego = 0;
    }
    
    /**
     * 
     */
    public void addVideojuego(String titulo, int dia, int mes, int anyo, String plataforma)
    {
        Videojuegos nuevoVideojuego = new Videojuegos(titulo, dia, mes, anyo, plataforma);
        listaDeVideojuegos.add(nuevoVideojuego);
        codVideojuego = codVideojuego + 1; 
    }
    
    /**
     * Mostrar tareas numeradas
     */
    public void mostrarVideojuegosNumerados()
    {
        int posicActual = 0;
        while (posicActual < listaDeVideojuegos.size()) {
            System.out.println((posicActual+1) + ". " + listaDeVideojuegos.get(posicActual).getDatosVideojuego());
            posicActual++;
        }
    }
    
}
