package modelo.construccion;

import modelo.desgaste.*;
import modelo.herramientas.*;

public class PicoMetalConstructor extends Constructor {

    private static PicoMetalConstructor instancia = new PicoMetalConstructor();
    public PicoMetalConstructor(){}

    private int durabilidad = 400;
    private int fuerza = 12;

    public Herramienta construir(){
        Desgastable abrupto = new DesgastableAbrupto();
        return new PicoDeMetal(durabilidad,fuerza,abrupto);
    }

    public void chequearPatron(){
    }

    public PicoMetalConstructor getInstancia(){
        return instancia;
    }

}