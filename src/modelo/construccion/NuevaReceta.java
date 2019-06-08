package modelo.construccion;

import modelo.materiales.*;

public class NuevaReceta extends Receta {

    public NuevaReceta(){

        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  vacio,  vacio,  vacio,
                            vacio,  vacio,  vacio,
                            vacio,  vacio,  vacio   };

        receta = tmp;

    }
}
