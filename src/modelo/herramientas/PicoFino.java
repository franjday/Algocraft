package modelo.herramientas;

import modelo.desgaste.DesgasteFino;
import modelo.materiales.*;

public class PicoFino extends Pico {

    public PicoFino(){
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgaste = new DesgasteFino();
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
        this.durabilidad = (int) this.desgaste.desgastar(this.durabilidad);
        unDiamante.disminuirDurabilidad(this.fuerza);
    }
}
