package Modelo.MesaDeCrafteo;

import Modelo.Recetas.NuevaReceta;
import Modelo.Herramientas.Herramienta;
import Modelo.Materiales.*;

public class MesaDeCrafteo {

    private NuevaReceta recetaActual;       //Receta sobre la mesa

    public MesaDeCrafteo(){
        recetaActual = new NuevaReceta();
    }

    // Comprueba si hay algun constructor asociado y lo asigna
    private void comprobarReceta(){
        recetaActual.actualizarConstructor();
    }

    public void ingresarMaterial(Material material, int posicion){
        recetaActual.ingresarMaterial(material,posicion);
        this.comprobarReceta();
    }

    public Material eliminarMaterial(int posicion){
        Material material = recetaActual.eliminarMaterial(posicion);
        this.comprobarReceta();
        return material;
    }

    //Construye lo que hay en el constructor.
    public Herramienta construirHerramienta(){
        return recetaActual.constructor.construir();
    }

    public Material[] getReceta(){
        return recetaActual.getPatron();
    }
}
