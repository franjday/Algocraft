package modelo.herramientas;

import modelo.desgaste.*;

public class Hacha extends Herramienta {

    public Hacha(int durabilidad, int fuerza, Desgaste desgaste) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
    }
    public Herramienta usar(){
        return this;
    }
}
