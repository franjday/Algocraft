import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerramientasTest {

    @Test
    public void testHachaDeMaderaCon100Durabilidad{
        Herramienta unHachaDeMadera = new Hacha(100, 2);

        assertEquals(100, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaCon2Fuerza{
        Herramienta unHachaDeMadera = new Hacha(100, 2);

        assertEquals(2, unHachaDeMadera.getFuerza);
    }

    @Test
    public void testHachaDeMetalCon400Durabilidad{
        Herramienta unHachaDeMetal = new Hacha(400, 10);

        assertEquals(400, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalCon10Fuerza{
        Herramienta unHachaDeMetal = new Hacha(400, 10);

        assertEquals(10, unHachaDeMetal.getFuerza());
    }

    @Test
    public void testPicoDeMaderaCon100Durabilidad{
        Herramienta unPicoDeMadera = new Pico(100, 2);

        assertEquals(100, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void getTestPicoDeMaderaCon2Fuerza{
        Herramientas unPicoDeMadera = new Pico(100, 2);

        assertEquals(100, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoaDeMetalCon400Durabilidad{
        Herramienta unPicoDeMetal = new Pico(400, 10);

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalCon10Fuerza{
        Herramienta unPicoDeMetal = new Pico(400, 12);

        assertEquals(12, unPicoDeMetal.getFuerza());
    }

    @Test
    public void testPicoFinoCon1000Durabilidad{
        Herramienta unPicoFino = new Pico(1000, 20);

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoCon20Fuerza{
        Herramienta unPicoFino = new Pico(1000, 20);

        assertEquals(20, unPicoFino.getFuerza());
    }
}
