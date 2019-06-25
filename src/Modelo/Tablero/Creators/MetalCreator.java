package Modelo.Tablero.Creators;

import Modelo.Materiales.*;

public class MetalCreator extends AbstractCreator {

    public MetalCreator(int unRadio, int unaDensidad){

        super(unRadio,unaDensidad);
        this.setNextCreator(new DiamanteCreator(unRadio,unaDensidad));
        this.clave = "Metal";
        this.instanciaDeMaterial = new Metal();
        this.probalibilidad = 3;
    }
}
