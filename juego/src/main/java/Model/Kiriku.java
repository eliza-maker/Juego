package Model;

import java.util.List;

public class Kiriku extends Atacante{
    public Kiriku(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }
    @Override
    public void atacar(List<Atacante> enemigos) {
        for (Atacante enemigo : enemigos) {
            if (enemigo.getVida() > 0) {
                enemigo.recibirAtaque(getFuerza());
                System.out.println(getNombre() + "Se esconde en las sombras y ataca a" + enemigo.getNombre() + " causando " + getFuerza() + " de daño.");
            }
        }
    }
}
