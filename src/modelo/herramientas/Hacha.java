package modelo.herramientas;

import modelo.desgaste.*;

public class Hacha extends Herramienta {

    public Hacha(int durabilidad, int fuerza, Desgaste desgaste) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
    }

    public void golpear(Madera unaMadera){
        this.durabilidad = this.desgastar(this.durabilidad);
        unaMadera.disminuirDurabilidad(this.fuerza);
    }

    public void golpear(Piedra unaPiedra){
        this.durabilidad = this.desgastar(this.durabilidad);
    }

    public void golpear(Metal unMetal){
        this.durabilidad = this.desgastar(this.durabilidad);
    }

    public void golpear(Diamante unDiamante){
        this.durabilidad = this.desgastar(this.durabilidad);
    }

}