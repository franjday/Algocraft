package modelo.construccion;

import modelo.materiales.*;

public class PicoMetalReceta extends Receta {

    //Singleton
    private static PicoMetalReceta instancia = new PicoMetalReceta();
    public static PicoMetalReceta getInstance(){
        return instancia;
    }
    
    private PicoMetalReceta(){

        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();
        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  metal,  metal,  metal,
                            vacio,  madera, vacio,
                            vacio,  madera, vacio   };

        receta = tmp;
        constructor = new PicoMetalConstructor();

    }
}
