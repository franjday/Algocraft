package modelo.herramientas;

import modelo.materiales.*;

public interface Herramienta {
    int getDurabilidad();

    int getFuerza();

    void recolectar(Madera unaMadera);

    void recolectar(Piedra unaPiedra);

    void recolectar(Metal unMetal);

    void recolectar(Diamante unDiamante);
}
