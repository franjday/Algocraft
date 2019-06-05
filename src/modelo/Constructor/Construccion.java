package modelo.Constructor;

import modelo.desgaste.*;
import modelo.herramientas.*;

public abstract class Constructor {

    public Hacha ConstruirHachaDeMadera(int durablidad, int fuerza, Material ListaDeMateriales, int identificacion){
    }
    public Hacha ConstruirHachaDeMetal(int durablidad, int fuerza, Material ListaDeMateriales){
    }
    public Hacha ConstruirHachaDePiedra(int durablidad, int fuerza, Material ListaDeMateriales){
    }
    public Pico ConstruirPicoDeMadera(int durablidad, int fuerza, Material ListaDeMateriales){
    }
    public Pico ConstruirPicoDeMetal(int durablidad, int fuerza, Material ListaDeMateriales){
    }
    public Pico ConstruirPicoDePiedra(int durablidad, int fuerza, Material ListaDeMateriales){
    }
    public Pico ConstruirPicoFino(int durablidad, int fuerza, Material ListaDeMateriales){
    }


}