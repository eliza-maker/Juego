package Model;

import java.util.List;

 public abstract class Atacante implements Atacable {
    private String nombre;
    private int vida;
    private int fuerza;

    public Atacante(String nombre, int vida, int fuerza){
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public abstract void atacar(List<Atacante> enemigos);

    @Override
    public void recibirAtaque(int dano) {
        setVida(getVida() - dano);
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + Math.max(0, vida));
    }
}