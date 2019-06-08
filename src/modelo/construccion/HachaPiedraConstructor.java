package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class HachaPiedraConstructor extends Constructor{
    private int durabilidad = 200;
    private int fuerza = 5;
    private int coeficiente = fuerza;

    public Herramienta construir(){
        Desgastable lineal = new DesgastableLineal(coeficiente);
        return new Hacha(durabilidad,fuerza,lineal);
    }

    public void chequearPatron(){
    }
}
