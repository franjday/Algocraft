package modelo.construccion;

import modelo.materiales.*;

public class PicoFinoReceta extends Receta {

    //Singleton
    private static PicoFinoReceta instancia = new PicoFinoReceta();
    public static PicoFinoReceta getInstance(){
        return instancia;
    }
    
    private PicoFinoReceta(){

        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Metal metal = Metal.getInstance();
        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  metal,  metal,  metal,
                            piedra, madera, vacio,
                            vacio,  madera, vacio   };

        receta = tmp;
        constructor = new PicoFinoConstructor();

    }
}
