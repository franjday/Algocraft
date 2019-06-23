package Modelo.Herramientas;

import Modelo.Desgastes.Desgastable;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;

public class HachaDeMetal extends Hacha {

    public HachaDeMetal(int durabilidad, int fuerza, Desgastable desgastable) {
        super(durabilidad, fuerza, desgastable);
    }
}
