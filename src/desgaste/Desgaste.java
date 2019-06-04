package desgaste;

public abstract class Desgaste {
    protected int durabilidad;
    protected int fuerza;

    public Desgaste(int durabilidad, int fuerza){
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
    }

    public int getDurabilidad(){
        return this.durabilidad;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public abstract void desgastar();
}
