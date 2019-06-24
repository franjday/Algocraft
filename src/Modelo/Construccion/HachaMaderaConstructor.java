package Modelo.Construccion;

import Modelo.Desgastes.*;
import Modelo.Herramientas.*;

public class HachaMaderaConstructor extends Constructor{

    private int durabilidad = 12;
    private int fuerza = 2;
    private int coeficiente = fuerza;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new HachaDeMadera(durabilidad,fuerza,lineal);
    }

}
