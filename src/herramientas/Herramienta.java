package herramientas;

import desgaste.Desgaste;

public abstract class Herramienta {
    protected Desgaste desgaste;

    public Herramienta(){ }
    public int getDurabilidad(){
        return desgaste.getDurabilidad();
    }

    public int getFuerza(){
        return desgaste.getFuerza();
    }

    public abstract Herramienta usar();
}
