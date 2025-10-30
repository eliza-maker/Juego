package Model;

import java.util.List;

public class Mago extends Atacante{
    public Mago(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }
    @Override
    public void atacar(List<Atacante> enemigos) {
        for (Atacante enemigo : enemigos) {
            if (enemigo.getVida() > 0) {
                enemigo.recibirAtaque(getFuerza());
                System.out.println(getNombre() + " lanza una bola de fuego a" + enemigo.getNombre() + " causando " + getFuerza() + " de daño.");
            }
        }
    }
}

