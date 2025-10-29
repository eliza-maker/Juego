package Model;
import java.util.ArrayList;
import java.util.Optional;

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
    //CRUD de las clases
    //
    //Equipo

    public Optional <Equipo> buscarEquipo(String nombre){
        return listaEquipos.stream().filter(equipo-> equipo.getNombre().equals(nombre)).findFirst();
    }
    public String ingresarEquipo(Equipo equipo) {
        Optional<Equipo> existente = buscarEquipo(equipo.getNombre());
        if (existente.isPresent()) {
            return "El equipo ya existe";
        } else {
            listaEquipos.add(equipo);
            return "El equipo se registro con exito";
        }
    }

    public String actualizarEquipo(String nuevoNombre, String nombreActual ) {
        Optional<Equipo> equipoEncontrado = buscarEquipo(nombreActual);
        if (equipoEncontrado.isPresent()) {
            Equipo equipo = equipoEncontrado.get();
            equipo.setNombre(nuevoNombre);
            return "Equipo actualizado con éxito";
        } else {
            return "Equipo no encontrado";
        }
    }
    public String eliminarEquipo(String nombre) {
        Optional<Equipo> equipoEncontrado = buscarEquipo(nombre);
        if (equipoEncontrado.isPresent()) {
            listaEquipos.remove(equipoEncontrado.get());
            return "Equipo eliminado correctamente";
        } else {
            return "Equipo no encontrado";
        }
    }

}
