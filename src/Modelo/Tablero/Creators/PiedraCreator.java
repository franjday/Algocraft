package Modelo.Tablero.Creators;

import Modelo.Materiales.Piedra;

public class PiedraCreator extends AbstractCreator {

    public PiedraCreator(int unRadio, int unaDensidad){
        super(unRadio,unaDensidad);
        this.setNextCreator(new MetalCreator(unRadio,unaDensidad));
        this.clave = "Piedra";
        this.instanciaDeMaterial = new Piedra();
        this.probalibilidad = 5;
    }
}
