package Modelo.Recetas;

import Modelo.Construccion.PicoMetalConstructor;
import Modelo.Materiales.*;

public class PicoMetalReceta extends Receta {
    
    public PicoMetalReceta(){

        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();
        Vacio vacio = Vacio.getInstance();

        constructor = new PicoMetalConstructor();
        patron = new Material[]{  metal,  metal,  metal,
                                  vacio,  madera, vacio,
                                  vacio,  madera, vacio };
    }
}
