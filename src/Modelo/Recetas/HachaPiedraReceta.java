package Modelo.Recetas;

import Modelo.Construccion.HachaPiedraConstructor;
import Modelo.Materiales.*;

public class HachaPiedraReceta extends Receta {
    
    public HachaPiedraReceta(){

        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Vacio vacio = Vacio.getInstance();

        Material[] tmp = {  piedra, piedra, vacio,
                            piedra, madera, vacio,
                            vacio,  madera, vacio };

        receta = tmp;
        constructor = new HachaPiedraConstructor();

    }
}
