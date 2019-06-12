package modelo.construccion;

import modelo.materiales.*;

public class HachaPiedraReceta extends Receta {

    //Singleton
    private static HachaPiedraReceta instancia = new HachaPiedraReceta();
    public static HachaPiedraReceta getInstance(){
        return instancia;
    }
    
    private HachaPiedraReceta(){

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
