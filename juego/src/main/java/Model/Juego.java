package Model;
import java.util.ArrayList;

public class Juego {
    protected String nombre;
    protected ArrayList<Equipo> listaEquipos;
    protected ArrayList<Jugador> listaJugadores;
    public Juego(String nombre) {
        this.nombre = nombre;
        this.listaEquipos = new ArrayList<>();
        this.listaJugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }


}
