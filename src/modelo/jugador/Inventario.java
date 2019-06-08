package modelo.jugador;
import modelo.herramientas.*;
import modelo.materiales.*;
import java.util.*;

public class Inventario {
    private ArrayList inventarioMateriales;
    private ArrayList inventarioHerramientas;

    public Inventario(){
        inventarioHerramientas = new ArrayList<Herramienta>();
        inventarioMateriales = new ArrayList<Material>();
    }

    public ArrayList getMateriales(){
        return inventarioMateriales;
    }

    public ArrayList getHerramientas(){
        return inventarioHerramientas;
    }

    public void EliminarHerramienta(){

    }

    public void RecolectarMaterial(){}
}

