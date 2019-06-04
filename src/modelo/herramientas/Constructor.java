package modelo.herramientas;

import modelo.desgaste.*;

public class Constructor {
    private static final int
        FUERZA_HACHA_MADERA = 2,
        FUERZA_HACHA_PIEDRA = 5,
        FUERZA_HACHA_METAL = 10,
        FUERZA_PICO_MADERA = 2,
        FUERZA_PICO_PIEDRA = 4,
        FUERZA_PICO_METAL = 12,
        FUERZA_PICO_FINO = 20;

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
        DesgasteLineal desgastePico = new DesgasteLineal(FUERZA_PICO_MADERA);
        return new Pico(100, FUERZA_PICO_MADERA, desgastePico);
    }

    public Pico construirPicoDePiedra(){
        DesgasteLineal desgastePico = new DesgasteLineal(FUERZA_PICO_PIEDRA/1.5);
        return new Pico(200, FUERZA_PICO_PIEDRA, desgastePico);
    }

    public Pico construirPicoDeMetal(){
        DesgasteAbrupto desgastePico = new DesgasteAbrupto();
        return new Pico(400, FUERZA_PICO_METAL, desgastePico);
    }

    public Pico construirPicoFino(){
        DesgasteFino desgastePico = new DesgasteFino();
        return new Pico(1000, FUERZA_PICO_FINO, desgastePico);
    }
}
