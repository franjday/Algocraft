package modelo.herramientas;

import modelo.materiales.*;

public abstract class Herramienta {
    public abstract int getDurabilidad();

    public abstract int getFuerza();

    public abstract void recolectar(Madera unaMadera);

    public abstract void recolectar(Piedra unaPiedra);

    public abstract void recolectar(Metal unMetal);

    public abstract void recolectar(Diamante unDiamante);
}
