package Modelo.MesaDeCrafteo;

import Modelo.Recetas.NuevaReceta;
import Modelo.Recetas.Receta;
import Modelo.Construccion.*;
import Modelo.Herramientas.Herramienta;
import Modelo.Materiales.*;

public class MesaDeCrafteo {

    private Receta recetaActual;       //Receta sobre la mesa
    private Constructor constructorDeHerramienta;  //Constructor de una herramienta asociado a la receta actual (si existe)

    public MesaDeCrafteo(){
        recetaActual = new NuevaReceta();
        constructorDeHerramienta = ConstructorVacio.getInstance();
    }


    // Comprueba si hay algun constructor asociado y lo asigna
    private void comprobarReceta(){
        this.constructorDeHerramienta = recetaActual.coincidenciaDeRecetas();
    }

    public void ingresarMaterial(Material material, int posicion){
        recetaActual.ingresarMaterial(material,posicion);
        this.comprobarReceta();
    }

    public void eliminarMaterial(int posicion){
        recetaActual.eliminarMaterial(posicion);
        this.comprobarReceta();
    }

    //Construye lo que hay en el constructor.
    public Herramienta construirHerramienta(){
        return constructorDeHerramienta.construir();
    }
}
