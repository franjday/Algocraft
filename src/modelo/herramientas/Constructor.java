package modelo.herramientas;

import modelo.desgaste.*;

public class Constructor {
    private static final int
        FUERZA_HACHA_MADERA = 2,
        FUERZA_HACHA_PIEDRA = 5,
        FUERZA_HACHA_METAL = 10;

    public Hacha construirHachaDeMadera(){
        DesgasteLineal desgasteHacha = new DesgasteLineal(FUERZA_HACHA_MADERA);
        return new Hacha(100, FUERZA_HACHA_MADERA, desgasteHacha);
    }

    public Hacha construirHachaDePiedra(){
        DesgasteLineal desgasteHacha = new DesgasteLineal(FUERZA_HACHA_PIEDRA);
        return new Hacha(200, FUERZA_HACHA_PIEDRA, desgasteHacha);
    }

    public Hacha construirHachaDeMetal(){
        DesgasteLineal desgasteHacha = new DesgasteLineal(FUERZA_HACHA_METAL/2);
        return new Hacha(400, FUERZA_HACHA_METAL, desgasteHacha);
    }

    public Pico construirPicoDeMadera(){
        return new PicoDeMadera();
    }

    public Pico construirPicoDePiedra(){
        return new PicoDePiedra();
    }

    public Pico construirPicoDeMetal(){
        return new PicoDeMetal();
    }

    public Pico construirPicoFino(){
        return new PicoFino();
    }
}
