package Modelo.Jugador;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;

import java.util.ArrayList;



public class Inventario {
    private ArrayList<Material> inventarioMateriales;
    private ArrayList<Herramienta> inventarioHerramientas;

    public Inventario() {
        inventarioHerramientas = new ArrayList<>();
        inventarioMateriales = new ArrayList<>();

    }

    public ArrayList getMateriales() {
        return inventarioMateriales;
    }


    public ArrayList getHerramientas() {
        return inventarioHerramientas;
    }


    public void EliminarHerramienta(Herramienta unaHerramienta) { inventarioHerramientas.remove(unaHerramienta);
    }

    public Herramienta eliminarHerramienta(int posicion){
        return inventarioHerramientas.remove(posicion);
    }

    public void EliminarMaterial(Material unMaterial) { inventarioMateriales.remove(unMaterial);
    }


    public void RecolectarMaterial(Material unMaterial) { inventarioMateriales.add(unMaterial);
    }

    public void RecolectarHerramienta(Herramienta unaHerramienta) {
        if(!(unaHerramienta instanceof SinHerramienta))
            inventarioHerramientas.add(unaHerramienta);
    }



}


