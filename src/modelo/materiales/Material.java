package modelo.materiales;

import modelo.tablero.*;

public abstract class Material implements Contenible {
    protected int durabilidad;

    public int getDurabilidad(){
        return this.durabilidad;
    }

    public void disminuirDurabilidad (int golpe) {
        durabilidad -= golpe;
    }

    public boolean SePuedeRecolectar(){
        return (durabilidad == 0);
    }
}
