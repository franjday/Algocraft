package Modelo.Construccion;

import Modelo.Desgastes.*;
import Modelo.Herramientas.*;

public class PicoPiedraConstructor extends Constructor {

    private int durabilidad = 200;
    private int fuerza = 4;
    private double coeficienteDeDesgaste = fuerza/1.5;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficienteDeDesgaste);
        return new PicoDePiedra(durabilidad,fuerza,lineal);
    }

}
