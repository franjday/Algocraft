package Modelo.Herramientas;

import Modelo.Desgastes.Desgastable;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;

public class HachaDeMadera extends Hacha {

    public HachaDeMadera(int durabilidad, int fuerza, Desgastable desgastable) {
        super(durabilidad, fuerza, desgastable);
    }
}


