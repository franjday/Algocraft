import modelo.herramientas.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PicoTest {

    @Test
    public void testPicoDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();

        assertEquals(100, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaCon2Fuerza(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();

        assertEquals(2, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMetal = unConstructor.construirPicoDeMetal();

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalCon10Fuerza(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMetal = unConstructor.construirPicoDeMetal();

        assertEquals(12, unPicoDeMetal.getFuerza());
    }

    @Test
    public void testPicoFinoCon1000Durabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoFino = unConstructor.construirPicoFino();

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoCon20Fuerza(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoFino = unConstructor.construirPicoFino();

        assertEquals(20, unPicoFino.getFuerza());
    }

    @Test
    public void testPicoDeMaderaGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Material unaMadera = new Madera();

        unPicoDeMadera.golpear(unaMadera);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Material unaPiedra = new Piedra();

        unPicoDeMadera.golpear(unaPiedra);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Material unMetal = new Metal();

        unPicoDeMadera.golpear(unMetal);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Material unDiamante = new Diamante();

        unPicoDeMadera.golpear(unDiamante);

        assertEquals(98, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Material unaMadera = new Madera();

        unPicoDePiedra.golpear(unaMadera);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Material unaPiedra = new Piedra();

        unPicoDePiedra.golpear(unaPiedra);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Material unMetal = new Metal();

        unPicoDePiedra.golpear(unMetal);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Material unDiamante = new Diamante();

        unPicoDePiedra.golpear(unDiamante);

        assertEquals( (200 - (4 / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Material unaMadera = new Madera();

        unPicoDeMetal.golpear(unaMadera);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Material unaPiedra = new Piedra();

        unPicoDeMetal.golpear(unaPiedra);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Material unMetal = new Metal();

        unPicoDeMetal.golpear(unMetal);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Material unDiamante = new Diamante();

        unPicoDeMetal.golpear(unDiamante);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoFino = unConstructor.construirPicoFino();
        Material unaMadera = new Madera();

        unPicoFino.golpear(unaMadera);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaPiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoFino = unConstructor.construirPicoFino();
        Material unaPiedra = new Piedra();

        unPicoFino.golpear(unaPiedra);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoFino = unConstructor.construirPicoFino();
        Material unMetal = new Metal();

        unPicoFino.golpear(unMetal);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoFino = unConstructor.construirPicoFino();
        Material unDiamante = new Diamante();

        unPicoFino.golpear(unDiamante);

        assertEquals( (1000 - (1000 * 0.1)), unPicoFino.getDurabilidad());
    }

}
