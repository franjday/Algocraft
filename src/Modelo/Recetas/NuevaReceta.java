package Modelo.Recetas;

import Modelo.Materiales.*;

public class NuevaReceta extends Receta {

    public NuevaReceta(){

        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  vacio,  vacio,  vacio,
                            vacio,  vacio,  vacio,
                            vacio,  vacio,  vacio   };

        receta = tmp;

    }
}
