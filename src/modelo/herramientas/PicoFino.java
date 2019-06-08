package modelo.herramientas;

import modelo.desgaste.Desgastable;
import modelo.materiales.*;

public class PicoFino extends Pico {

    public PicoFino(int durabilidad, int fuerza, Desgastable desgastable) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgastable = desgastable;
    }

    public void recolectar(Madera unaMadera){
    }

    public void recolectar(Piedra unaPiedra){
        unaPiedra.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Metal unMetal){
        unMetal.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Diamante unDiamante){
        this.durabilidad = (int) this.desgastable.desgastar(this.durabilidad);
        unDiamante.disminuirDurabilidad(this.fuerza);
    }
}
