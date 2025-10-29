package Model;

import java.util.ArrayList;

public class Equipo {

    protected String nombre;
    protected ArrayList<Jugador> listaJugadores;
    protected ArrayList<Atacante> listaAtacantes;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
        this.listaAtacantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public ArrayList<Atacante> getListaAtacantes() {
        return listaAtacantes;
    }

    public void setListaAtacantes(ArrayList<Atacante> listaAtacantes) {
        this.listaAtacantes = listaAtacantes;
    }
}
