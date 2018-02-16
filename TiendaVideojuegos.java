import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
    public TiendaVideojuegos(String datos)
    {
        listaDeVideojuegos = new ArrayList<Videojuegos>();
        codVideojuego = 0;
        try{
            File archivo = new File(datos);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] datosVideojuego = sc.nextLine().split("#");
                String titulo = datosVideojuego[0];
                String plataforma = datosVideojuego[1];
                int dia = Integer.parseInt(datosVideojuego[2]);
                int mes = Integer.parseInt(datosVideojuego[3]);
                int anyo = Integer.parseInt(datosVideojuego[4]);
                addVideojuego(titulo, dia, mes, anyo, plataforma);
            }
            
            sc.close();
        }
        catch (FileNotFoundException a) {
            a.printStackTrace();
        }
        
    }
    
    /**
     * Añadir videojuego
     */
    public void addVideojuego(String titulo, int dia, int mes, int anyo, String plataforma)
    {
        Videojuegos nuevoVideojuego = new Videojuegos(titulo.toLowerCase(), dia, mes, anyo, plataforma.toLowerCase(), codVideojuego);
        listaDeVideojuegos.add(nuevoVideojuego);
        codVideojuego = codVideojuego + 1;
    }
    
    /**
     * Mostrar Videojuegos numerados segun se hayan ido introduciendo
     */
    public void mostrarVideojuegosNumeradosPorOrdenDeRegistro()
    {
        int posicActual = 0;
        while (posicActual < listaDeVideojuegos.size()) {
            System.out.println((posicActual+1) + ". " + listaDeVideojuegos.get(posicActual).getDatosVideojuego());
            posicActual++;
        }
    }
    
    /**
     * Mostrar lista de todos los videojuegos registrados
     */
    public void listarTodosLosVideojuegosRegistrados()
    {
        System.out.println("Videojuegos disponibles: ");
        for(Videojuegos videojuego : listaDeVideojuegos) {
            System.out.println(videojuego.getDatosVideojuego());
        }
    }
    
    /**
     * Cambia el titulo del videojuego
     */
    public void cambiarTitulo(int codVideojuego, String tituloNuevo)
    {
        if(codVideojuego>=0 && codVideojuego<=listaDeVideojuegos.size()) {
            Videojuegos Videojuego = listaDeVideojuegos.get(codVideojuego - 1);
            Videojuego.setTitulo(tituloNuevo);
        }
        else if(codVideojuego<=0 && codVideojuego>listaDeVideojuegos.size()){
            System.out.println("No hay videojuegos con ese codigo, introduce otro existente.");
        }
    }
    
    /**
     *  Elimina videojuegos segun su plataforma
     */
    public void eliminarVideojuegoPorPlataforma(String plataforma)
    {
        Iterator<Videojuegos> iteration = listaDeVideojuegos.iterator();
        while(iteration.hasNext()){
            Videojuegos iter = iteration.next();
            String plataformaVideojuego = iter.getPlataforma();
            if(plataformaVideojuego.equals(plataforma)){
                iteration.remove();
            }
        }
    }
}
