package modelo.jugador;

import java.util.ArrayList;
import modelo.herramientas.*;

public class Jugador {
    private Herramienta herramientaEquipada;
    private ArrayList inventario;

    public Jugador(Herramienta herramientaInicial){
        herramientaEquipada = herramientaInicial;
    }

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }
}
