package Modelo.Herramientas;

import Modelo.Desgastes.Desgastable;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;

public class HachaDePiedra extends Hacha {

    public HachaDePiedra(int durabilidad, int fuerza, Desgastable desgastable){
        super(durabilidad, fuerza, desgastable);
    }
}
