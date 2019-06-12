package modelo.construccion;

import modelo.materiales.*;

public class HachaMaderaReceta extends Receta {

    //Singleton
    private static HachaMaderaReceta instancia = new HachaMaderaReceta();
    public static HachaMaderaReceta getInstance(){
        return instancia;
    }

    private HachaMaderaReceta(){

        Madera madera = Madera.getInstance();
        Vacio vacio = Vacio.getInstance();


        Material[] tmp = {  madera, madera, vacio,
                            madera, madera, vacio,
                            vacio,  madera, vacio };

        receta = tmp;
        constructor = new HachaMaderaConstructor();

    }
}
