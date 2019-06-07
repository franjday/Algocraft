package modelo.jugador;

import java.util.*;
import modelo.herramientas.*;
import modelo.materiales.*;

public class Jugador {
    private Herramienta herramientaEquipada;
    private ArrayList inventarioMateriales;
    private ArrayList inventarioHerramientas;

    public Jugador(){
        Constructor unConstructor = new Constructor();
        herramientaEquipada = unConstructor.construirHachaDeMadera();
        inventarioHerramientas = new ArrayList<Herramienta>();
        inventarioMateriales = new ArrayList<Material>();
    }

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }

    public ArrayList getInventarioMateriales(){
        return inventarioMateriales;
    }

    public ArrayList getInventarioHerramientas(){
        return inventarioHerramientas;
    }
}
