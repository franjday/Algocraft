package Modelo.Tablero.Creators;

import Modelo.Materiales.Material;
import Modelo.Tablero.Creators.AbstractCreator;
import Modelo.Tablero.Mapa;
import Modelo.Tablero.Posicion;

public class VoidCreator extends AbstractCreator {

    public VoidCreator(int unRadio, int unaDensidad){
        super(unRadio,unaDensidad);
    }

    public Material generar(Mapa mapa, Posicion posicion){
        return null;
    }
}
