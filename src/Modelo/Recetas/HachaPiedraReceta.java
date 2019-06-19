package Modelo.Recetas;

import Modelo.Construccion.HachaPiedraConstructor;
import Modelo.Materiales.*;

public class HachaPiedraReceta extends Receta {
    
    public HachaPiedraReceta(){

        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Vacio vacio = Vacio.getInstance();

        constructor = new HachaPiedraConstructor();
        patron = new Material[]{  piedra, piedra, vacio,
                                  piedra, madera, vacio,
                                  vacio,  madera, vacio };
    }
}
