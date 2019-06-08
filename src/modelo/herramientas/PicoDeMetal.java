package modelo.herramientas;

import modelo.desgaste.Desgastable;
import modelo.materiales.*;

public class PicoDeMetal extends Pico{

    public PicoDeMetal(int durabilidad, int fuerza, Desgastable desgastable) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgastable = desgastable;
    }

    public void recolectar(Madera unaMadera){
        this.durabilidad = (int) this.desgastable.desgastar(this.durabilidad);
    }

    public void recolectar(Piedra unaPiedra){
        this.durabilidad = (int) this.desgastable.desgastar(this.durabilidad);
        unaPiedra.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Metal unMetal){
        this.durabilidad = (int) this.desgastable.desgastar(this.durabilidad);
    }

    public void recolectar(Diamante unDiamante){
        this.durabilidad = (int) this.desgastable.desgastar(this.durabilidad);
    }

}
