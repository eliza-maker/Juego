package Model;

import java.util.LinkedList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String lema;
    private List<Atacante> listaAtacantes;

    public Equipo(String nombre, String lema) {
        this.nombre = nombre;
        this.lema = lema;
        this.listaAtacantes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public List<Atacante> getListaAtacantes() {
        return listaAtacantes;
    }

    public void setListaAtacantes(List<Atacante> listaAtacantes) {
        this.listaAtacantes = listaAtacantes;
    }

    public int calcularPoderTotal() {
        int poder = 0;
        for (Atacante a : listaAtacantes) {
            poder += a.fuerza;
        }
        return poder;
    }

    public void motivarEquipo() {
        System.out.println(nombre + " se motiva con su lema: \"" + lema + "\"");
        for (Atacante a : listaAtacantes) {
            a.fuerza += 1;
        }
    }

    public void ataqueColectivo() {
        System.out.println("¡" + nombre + " inicia un ataque conjunto!");
        for (Atacante a : listaAtacantes) {
            a.atacar();
        }
    }

    public void mostrarIdentidad() {
        System.out.println(nombre + " - \"" + lema + "\"");
    }

}
