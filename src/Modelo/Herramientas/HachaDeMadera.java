package Modelo.Herramientas;

import Modelo.Desgastes.Desgastable;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;

public class HachaDeMadera extends Hacha {

    public HachaDeMadera(int durabilidad, int fuerza, Desgastable desgastable) {
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


