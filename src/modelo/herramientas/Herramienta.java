package modelo.herramientas;

import modelo.desgaste.*;

public abstract class Herramienta {
    protected int durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;

    public int getDurabilidad(){
        return this.durabilidad;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public abstract Herramienta usar();
}
