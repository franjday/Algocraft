package Modelo.Construccion;

import Modelo.Desgastes.*;
import Modelo.Herramientas.*;

public class HachaMetalConstructor extends Constructor{

    private int durabilidad = 400;
    private int fuerza = 10;
    private int coeficiente = fuerza/2;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new Hacha(durabilidad,fuerza,lineal);
    }

}
