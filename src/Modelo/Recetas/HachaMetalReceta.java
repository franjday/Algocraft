package Modelo.Recetas;

import Modelo.Construccion.HachaMetalConstructor;
import Modelo.Materiales.*;

public class HachaMetalReceta extends Receta {
    
    public HachaMetalReceta(){

        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();
        Vacio vacio = Vacio.getInstance();

        constructor = new HachaMetalConstructor();
        patron = new Material[]{  metal, metal,  vacio,
                                  metal, madera, vacio,
                                  vacio, madera, vacio};
    }
}
