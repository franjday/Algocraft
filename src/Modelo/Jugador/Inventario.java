package modelo.jugador;
import modelo.herramientas.*;
import modelo.materiales.*;
import java.util.*;
import java.util.ArrayList;



public class Inventario {
    private ArrayList inventarioMateriales;
    private ArrayList inventarioHerramientas;

    public Inventario() {
        inventarioHerramientas = new ArrayList<Herramienta>();
        inventarioMateriales = new ArrayList<Material>();
    }

    public ArrayList getMateriales() {
        return inventarioMateriales;
    }


    public ArrayList getHerramientas() {
        return inventarioHerramientas;
    }


    public void EliminarHerramienta(Herramienta unaHerramienta) { inventarioHerramientas.remove(unaHerramienta);
    }

    public void EliminarMaterial(Material unMaterial) { inventarioMateriales.remove(unMaterial);
    }


    public void RecolectarMaterial(Material unMaterial) { inventarioMateriales.add(unMaterial);
    }

    public void RecolectarHerramienta(Herramienta unaHerramienta) {
        inventarioHerramientas.add(unaHerramienta);
    }



}

