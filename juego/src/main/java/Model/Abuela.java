package Model;

import java.util.List;

public class Abuela extends Atacante {
    public Abuela(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }

    @Override
    public void atacar(List<Atacante> enemigos) {
        for (Atacante enemigo : enemigos) {
            if (enemigo.getVida() > 0) {
                enemigo.recibirAtaque(getFuerza());
                System.out.println(getNombre() + " lanza una chancleta a " + enemigo.getNombre() + " causando " + getFuerza() + " de daño.");
            }
        }
    }
}
