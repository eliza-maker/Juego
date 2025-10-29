package Model;
import java.util.ArrayList;
public class Jugador {

    protected String nombre;
    protected ArrayList<Atacante> listaAtacantes;
    protected Equipo equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.listaAtacantes = new ArrayList<>();
        this.equipo = new Equipo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atacante> getListaAtacantes() {
        return listaAtacantes;
    }

    public void setListaAtacantes(ArrayList<Atacante> listaAtacantes) {
        this.listaAtacantes = listaAtacantes;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
}
