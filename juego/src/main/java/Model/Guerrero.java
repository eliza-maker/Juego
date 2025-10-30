package Model;

import java.util.List;

public class Guerrero extends Atacante{
    public Guerrero(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }
    @Override
    public void atacar(List<Atacante> enemigos) {
        for (Atacante enemigo : enemigos) {
            if (enemigo.getVida() > 0){
                enemigo.recibirAtaque(getFuerza());
                System.out.println(getNombre() + " Entierra su espada en " + enemigo.getNombre() + " causando " + getFuerza() + " de daño.");
            }
        }
    }
}
