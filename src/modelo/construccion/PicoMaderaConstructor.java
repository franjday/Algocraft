package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class PicoMaderaConstructor extends Constructor {

    private int durabilidad = 100;
    private int fuerza = 2;
    private int coeficiente = 2;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new PicoDeMadera(durabilidad,fuerza,lineal);
    }

}
