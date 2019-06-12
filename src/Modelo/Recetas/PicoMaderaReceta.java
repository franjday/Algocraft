package Modelo.Recetas;

import Modelo.Construccion.PicoMaderaConstructor;
import Modelo.Materiales.*;

public class PicoMaderaReceta extends Receta {

    //Singleton
    private static PicoMaderaReceta instancia = new PicoMaderaReceta();
    public static PicoMaderaReceta getInstance(){
        return instancia;
    }
    
    private PicoMaderaReceta(){

        Madera madera = Madera.getInstance();
        Vacio vacio = Vacio.getInstance();


        Material[] tmp = {  madera, madera, madera,
                            vacio,  madera, vacio,
                            vacio,  madera, vacio   };

        receta = tmp;
        constructor = new PicoMaderaConstructor();

    }
}
