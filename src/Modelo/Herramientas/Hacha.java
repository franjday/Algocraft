package Modelo.Herramientas;

import Modelo.Materiales.*;
import Modelo.Desgastes.*;

public class Hacha extends Herramienta {

    public Hacha(int durabilidad, int fuerza, Desgastable desgastable) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgastable = desgastable;
    }

    public void recolectar(Madera unaMadera){
        this.durabilidad = (int)this.desgastable.desgastar(this.durabilidad);
        unaMadera.disminuirDurabilidad(this.fuerza);
    }

    public void recolectar(Piedra unaPiedra){
        this.durabilidad = (int)this.desgastable.desgastar(this.durabilidad);
    }

    public void recolectar(Metal unMetal){
        this.durabilidad = (int)this.desgastable.desgastar(this.durabilidad);
    }

    public void recolectar(Diamante unDiamante){
        this.durabilidad = (int)this.desgastable.desgastar(this.durabilidad);
    }


}