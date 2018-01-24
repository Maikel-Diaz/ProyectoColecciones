import java.time.LocalDate;
/**
 * Write a description of class Videojuegos here.
 * 
 * @author (Maikel) 
 * @version (a version number or a date)
 */
public class Videojuegos
{
    // instance variables - replace the example below with your own
    private String titulo;
    private LocalDate fechaSalida;
    private String plataforma;
    
    /**
     * Constructor para la clase Videojuegos.
     */
    public Videojuegos(String titulo, int dia, int mes, int anyo, String plataforma)
    {
        // initialise instance variables
        this.titulo = titulo;
        fechaSalida = LocalDate.of(anyo, mes, dia);
        this.plataforma = plataforma;
    }
    
    /**
     * Devuelve el titulo del Videojuego.
     */
    public String getTitulo()
    {
        return titulo;
    }

}
