package modelo.jugador;

import java.util.*;

import modelo.construccion.Constructor;
import modelo.construccion.HachaMaderaConstructor;
import modelo.herramientas.*;
import modelo.materiales.*;

public class Jugador {
    private Herramienta herramientaEquipada;
    private ArrayList inventarioMateriales;
    private ArrayList inventarioHerramientas;

    public Jugador(){
        Constructor unConstructor = new HachaMaderaConstructor();
        herramientaEquipada = unConstructor.construir();
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
