package Modelo.Construccion;

import Modelo.Desgastes.*;
import Modelo.Herramientas.*;

public class PicoMaderaConstructor extends Constructor {

    private int durabilidad = 100;
    private int fuerza = 2;
    private int coeficiente = 2;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new PicoDeMadera(durabilidad,fuerza,lineal);
    }

}
