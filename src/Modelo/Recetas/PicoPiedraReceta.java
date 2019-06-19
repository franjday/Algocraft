package Modelo.Recetas;

import Modelo.Construccion.PicoPiedraConstructor;
import Modelo.Materiales.*;

class PicoPiedraReceta extends Receta {
    
    public PicoPiedraReceta(){

        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Vacio vacio = Vacio.getInstance();

        constructor = new PicoPiedraConstructor();
        patron = new Material[]{  piedra, piedra, piedra,
                                  vacio,  madera, vacio,
                                  vacio,  madera, vacio };

    }

}
