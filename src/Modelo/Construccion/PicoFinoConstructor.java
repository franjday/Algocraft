package Modelo.Construccion;

import Modelo.Desgastes.*;
import Modelo.Herramientas.*;

public class PicoFinoConstructor extends Constructor{

    private int durabilidad = 1000;
    private int fuerza = 20;

    public Herramienta construir(){
        Desgastable fino = new DesgastableFino();
        return new PicoFino(durabilidad,fuerza,fino);
    }

}
