import modelo.herramientas.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {

    @Test
    public void testHachaDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();

        assertEquals(100, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaCon2Fuerza(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();

        assertEquals(2, unHachaDeMadera.getFuerza());
    }

    @Test
    public void testHachaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();

        assertEquals(400, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalCon10Fuerza(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();

        assertEquals(10, unHachaDeMetal.getFuerza());
    }


    @Test
    public void testHachaDeMaderaGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Material unaMadera = new Madera();

        unHachaDeMadera.golpear(unaMadera);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Material unaPiedra = new Piedra();

        unHachaDeMadera.golpear(unaPiedra);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Material unMetal= new Metal();

        unHachaDeMadera.golpear(unMetal);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Material unDiamante= new Diamante();

        unHachaDeMadera.golpear(unDiamante);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    public void testHachaDePiedraGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Material unaMadera = new Madera();

        unHachaDePiedra.golpear(unaMadera);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    public void testHachaDePiedraGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Material unaPiedra = new Piedra();

        unHachaDePiedra.golpear(unaPiedra);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    public void testHachaDePiedraGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Material unMetal= new Metal();

        unHachaDePiedra.golpear(unMetal);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    public void testHachaDePiedraGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Material unDiamante = new Diamante();

        unHachaDePiedra.golpear(unDiamante);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    public void testHachaDeMetalGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Material unaMadera = new Madera();

        unHachaDeMetal.golpear(unaMadera);

        assertEquals(390, unHachaDeMetal.getDurabilidad());
    }

    public void testHachaDeMetalGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Material unaPiedra= new Piedra();

        unHachaDeMetal.golpear(unaPiedra);

        assertEquals(390, unHachaDeMetal.getDurabilidad());
    }

    public void testHachaDeMetalGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Material unMetal= new Metal();

        unHachaDeMetal.golpear(unMetal);

        assertEquals(390, unHachaDeMetal.getDurabilidad());
    }

    public void testHachaDeMetalGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Material unDiamante = new Diamante();

        unHachaDeMetal.golpear(unDiamante);

        assertEquals(390, unHachaDeMetal.getDurabilidad());
    }

}

