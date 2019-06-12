package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class PicoMetalConstructor extends Constructor {

    private int durabilidad = 400;
    private int fuerza = 12;


    public Herramienta construir(){
        Desgastable abrupto = new DesgastableAbrupto();
        return new PicoDeMetal(durabilidad,fuerza,abrupto);
    }

}