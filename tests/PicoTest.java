import modelo.herramientas.*;
import modelo.materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PicoTest {

    @Test
    public void testPicoDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();

        assertEquals(100, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaCon2Fuerza(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();

        assertEquals(2, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalCon10Fuerza(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();

        assertEquals(12, unPicoDeMetal.getFuerza());
    }

    @Test
    public void testPicoFinoCon1000Durabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoCon20Fuerza(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();

        assertEquals(20, unPicoFino.getFuerza());
    }
/*
    @Test
    public void testPicoDeMaderaGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Madera unaMadera = new Madera();

        unPicoDeMadera.recolectar(unaMadera);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Piedra unaPiedra = new Piedra();

        unPicoDeMadera.recolectar(unaPiedra);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Metal unMetal = new Metal();

        unPicoDeMadera.recolectar(unMetal);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Diamante unDiamante = new Diamante();

        unPicoDeMadera.recolectar(unDiamante);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Madera unaMadera = new Madera();

        unPicoDePiedra.recolectar(unaMadera);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Piedra unaPiedra = new Piedra();

        unPicoDePiedra.recolectar(unaPiedra);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Metal unMetal = new Metal();

        unPicoDePiedra.recolectar(unMetal);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Diamante unDiamante = new Diamante();

        unPicoDePiedra.recolectar(unDiamante);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Madera unaMadera = new Madera();

        unPicoDeMetal.recolectar(unaMadera);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Piedra unaPiedra = new Piedra();

        unPicoDeMetal.recolectar(unaPiedra);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Metal unMetal = new Metal();

        unPicoDeMetal.recolectar(unMetal);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Diamante unDiamante = new Diamante();

        unPicoDeMetal.recolectar(unDiamante);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Madera unaMadera = new Madera();

        unPicoFino.recolectar(unaMadera);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaPiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Piedra unaPiedra = new Piedra();

        unPicoFino.recolectar(unaPiedra);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Metal unMetal = new Metal();

        unPicoFino.recolectar(unMetal);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Diamante unDiamante = new Diamante();

        unPicoFino.recolectar(unDiamante);

        assertEquals( (int)(1000 - (1000 * 0.1)), unPicoFino.getDurabilidad());
    }
*/
}
