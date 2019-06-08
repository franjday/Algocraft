package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class PicoMaderaConstructor extends Constructor {

    private int
            durabilidad = 100,
            fuerza = 2,
            coeficiente = 2;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new PicoDeMadera(durabilidad,fuerza,lineal);
    }

    public void chequearPatron(){
    }

}
