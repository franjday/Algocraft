package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class PicoFinoConstructor extends Constructor{

    private int durabilidad = 1000;
    private int fuerza = 20;

    public Herramienta construir(){
        Desgastable fino = new DesgastableFino();
        return new PicoFino(durabilidad,fuerza,fino);
    }

    public void chequearPatron(){
    }

}
