package Modelo.Recetas;

import Modelo.Construccion.HachaMetalConstructor;
import Modelo.Materiales.*;

public class HachaMetalReceta extends Receta {
    
    public HachaMetalReceta(){

        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();
        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  metal, metal,  vacio,
                            metal, madera, vacio,
                            vacio, madera, vacio    };

        receta = tmp;
        constructor = new HachaMetalConstructor();

    }

}
