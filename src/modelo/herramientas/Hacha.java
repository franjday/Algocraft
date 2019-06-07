package modelo.herramientas;

import modelo.materiales.*;
import modelo.desgaste.*;

public class Hacha extends Herramienta {

    private int durabilidad;
    private int fuerza;
    private Desgaste desgaste;

    public Hacha(int durabilidad, int fuerza, Desgaste desgaste) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
    }

    public int getDurabilidad(){
        return this.durabilidad;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public void recolectar(Madera unaMadera){
        this.durabilidad = (int)this.desgaste.desgastar(this.durabilidad);
        unaMadera.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Piedra unaPiedra){
        this.durabilidad = (int)this.desgaste.desgastar(this.durabilidad);
    }

    public void recolectar(Metal unMetal){
        this.durabilidad = (int)this.desgaste.desgastar(this.durabilidad);
    }

    public void recolectar(Diamante unDiamante){
        this.durabilidad = (int)this.desgaste.desgastar(this.durabilidad);
    }

}