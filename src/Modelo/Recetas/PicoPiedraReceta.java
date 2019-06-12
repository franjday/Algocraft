package Modelo.Recetas;

import Modelo.Construccion.PicoPiedraConstructor;
import Modelo.Materiales.*;

public class PicoPiedraReceta extends Receta {
    
    //Singleton
    private static PicoPiedraReceta instancia = new PicoPiedraReceta();
    public static PicoPiedraReceta getInstance(){
        return instancia;
    }
    
    private PicoPiedraReceta(){

        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  piedra, piedra, piedra,
                            vacio,  madera, vacio,
                            vacio,  madera, vacio   };

        receta = tmp;
        constructor = new PicoPiedraConstructor();

    }

}
