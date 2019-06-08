package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class HachaMaderaConstructor extends Constructor{

    private int durabilidad = 100;
    private int fuerza = 2;
    private int coeficiente = fuerza;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new Hacha(durabilidad,fuerza,lineal);
    }

    public void chequearPatron(){
    }

}
