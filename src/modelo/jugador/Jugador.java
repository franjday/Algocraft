package modelo.jugador;

import java.util.ArrayList;
import modelo.herramientas.*;

public class Jugador {
    private Herramienta herramientaEquipada;
    private ArrayList inventario;

    public Jugador(){
        Constructor unConstructor = new Constructor();
        herramientaEquipada = unConstructor.construirHachaDeMadera();
    }

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }
}
