package Modelo.Recetas;

import Modelo.Construccion.HachaMaderaConstructor;
import Modelo.Materiales.*;

public class HachaMaderaReceta extends Receta {


    public HachaMaderaReceta(){

        Madera madera = Madera.getInstance();
        Vacio vacio = Vacio.getInstance();

        constructor = new HachaMaderaConstructor();
        patron = new Material[]{  madera, madera, vacio,
                                  madera, madera, vacio,
                                  vacio,  madera, vacio };

    }
}
