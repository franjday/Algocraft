package modelo.herramientas;

import modelo.desgaste.DesgasteLineal;
import modelo.materiales.*;

public class PicoDePiedra extends Pico{

    public PicoDePiedra(){
        this.durabilidad = 200;
        this.fuerza = 4;
        this.desgaste = new DesgasteLineal(4/1.5);
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
        unMetal.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Diamante unDiamante){
        this.durabilidad = (int) this.desgaste.desgastar(this.durabilidad);
    }

}
