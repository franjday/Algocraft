package modelo.herramientas;

import modelo.desgaste.Desgastable;
import modelo.materiales.*;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;
    protected Desgastable desgastable;

    public int getDurabilidad(){
        return this.durabilidad;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public boolean estaRota(){
        return (this.durabilidad == 0);
    }

    public abstract void recolectar(Madera unaMadera);

    public abstract void recolectar(Piedra unaPiedra);

    public abstract void recolectar(Metal unMetal);

    public abstract void recolectar(Diamante unDiamante);
}
