package modelo.herramientas;

import modelo.desgaste.DesgasteAbrupto;
import modelo.materiales.*;

public class PicoDeMetal extends Pico{

    public PicoDeMetal(){
        this.durabilidad = 400;
        this.fuerza = 12;
        this.desgaste = new DesgasteAbrupto();
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
        unDiamante.disminuirDurabilidad(this.fuerza);
    }

}
