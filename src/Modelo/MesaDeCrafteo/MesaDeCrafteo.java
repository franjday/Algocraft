package Modelo.MesaDeCrafteo;

import Modelo.Recetas.NuevaReceta;
import Modelo.Recetas.Receta;
import Modelo.Construccion.*;
import Modelo.Herramientas.Herramienta;
import Modelo.Materiales.*;

public class MesaDeCrafteo {

    private Receta receta_actual;       //Receta actual
    private Constructor herramienta;    //Constructor asociado a la receta actual (si existe)

    public MesaDeCrafteo(){
        receta_actual = new NuevaReceta();
    }

    //Ante cualquier alteracion de la receta actual comprueba si hay algun constructor asociado y lo asigna
    private void chequear_receta(){
        this.herramienta = receta_actual.buscar_coincidencias_con_patron_actual();
    }

    public void ingresar_material(Material material, int posicion){
        receta_actual.ingresar_material(material,posicion);
        this.chequear_receta();
    }

    public Material eliminar_material(int posicion){
        Material aux = receta_actual.eliminar_material(posicion);
        this.chequear_receta();
        return aux;
    }

    //Ejecuta el metodo construir() del constructor previamente asignado segun el patron actual.
    public Herramienta craftear(){
        return herramienta.construir();
    }
}
