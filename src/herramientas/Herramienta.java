package herramientas;

public abstract class Herramienta {
    protected Desgaste desgaste;

    public Herramienta(){
        this.inicializarDesgaste();
    }
    public int getDurabilidad{
        return desgaste.durabilidad();
    }

    public int getFuerza{
        return desgaste.fuerza();
    }

    protected abstract void inicializarDesgaste();
    public abstract Herramienta usar();
}
