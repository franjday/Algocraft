package Modelo.Tablero.Creators;

import Modelo.Materiales.Diamante;

public class DiamanteCreator extends AbstractCreator {

    public DiamanteCreator(int unRadio, int unaDensidad){

        super(unRadio,unaDensidad);
        this.setNextCreator(new VoidCreator(unRadio,unaDensidad));
        this.clave = "Diamante";
        this.instanciaDeMaterial = new Diamante();
        this.probalibilidad = 1;


    }
}
