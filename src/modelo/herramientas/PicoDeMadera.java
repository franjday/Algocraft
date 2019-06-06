package modelo.herramientas;

import modelo.desgaste.*;
import modelo.materiales.*;

public class PicoDeMadera extends Pico {

    public PicoDeMadera(){
        this.durabilidad = 100;
        this.fuerza = 2;
        this.desgaste = new DesgasteLineal(2);
    }

    public void recolectar(Madera unaMadera){
        this.durabilidad = (int) this.desgaste.desgastar(this.durabilidad);
    }

    public void recolectar(Piedra unaPiedra){
        this.durabilidad = (int) this.desgaste.desgastar(this.durabilidad);
        unaPiedra.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Metal unMetal){
        this.durabilidad = (int) this.desgaste.desgastar(this.durabilidad);
    }

    public void recolectar(Diamante unDiamante){
        this.durabilidad = (int) this.desgaste.desgastar(this.durabilidad);
    }
}
