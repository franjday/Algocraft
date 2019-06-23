package Modelo.Construccion;

import Modelo.Desgastes.*;
import Modelo.Herramientas.*;

public class HachaPiedraConstructor extends Constructor{

    private int durabilidad = 200;
    private int fuerza = 5;
    private int coeficiente = fuerza;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new HachaDePiedra(durabilidad,fuerza,lineal);
    }

}
