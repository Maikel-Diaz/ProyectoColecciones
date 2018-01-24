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
    
    /**
     * Devuelve la plataforma del Videojuego.
     */
    public String getPlataforma()
    {
        return plataforma;
    }
    
    /**
     * Devuelve la fecha de salida del Videojuego.
     */
    public LocalDate getFechaSalida()
    {
        return fechaSalida;
    }
    
    /**
     * Devuelve todos los datos del Videojuego.
     */
    public String getDatosVideojuego()
    {
        String datosADevolver = "Título: " + titulo + " / Plataforma: " + plataforma + " / Salida: " + fechaSalida; 
        return datosADevolver;
    }
    
    /**
     * Permite cambiar el titulo del Videojuego.
     */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    /**
     * Permite cambiar la plataforma del Videojuego.
     */
    public void setPlataforma(String plataforma)
    {
        this.plataforma = plataforma;
    }
    
    /**
     * Permite cambiar la plataforma del Videojuego.
     */
    public void setFechaSalida(int dia, int mes, int anyo)
    {
        fechaSalida = LocalDate.of(anyo, mes, dia);
    }

}
