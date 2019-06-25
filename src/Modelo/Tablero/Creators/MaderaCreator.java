package Modelo.Tablero.Creators;

import Modelo.Materiales.*;

public class MaderaCreator extends AbstractCreator {

    public MaderaCreator(int unRadio, int unaDensidad){

        super(unRadio,unaDensidad);
        this.setNextCreator(new PiedraCreator(unRadio,unaDensidad));
        this.clave = "Madera";
        this.instanciaDeMaterial = new Madera();
        this.probalibilidad = 20;
    }
}
