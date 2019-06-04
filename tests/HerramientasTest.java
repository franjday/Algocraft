import modelo.herramientas.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerramientasTest {

    @Test
    public void testHachaDeMaderaCon100Durabilidad(){
        Constructor constructor = new Constructor();
        Herramienta unHachaDeMadera = constructor.construirHachaDeMadera();

        assertEquals(100, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaCon2Fuerza(){
        Constructor constructor = new Constructor();
        Herramienta unHachaDeMadera = constructor.construirHachaDeMadera();

        assertEquals(2, unHachaDeMadera.getFuerza());
    }

    @Test
    public void testHachaDeMetalCon400Durabilidad(){
        Constructor constructor = new Constructor();
        Herramienta unHachaDeMetal = constructor.construirHachaDeMetal();

        assertEquals(400, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalCon10Fuerza(){
        Constructor constructor = new Constructor();
        Herramienta unHachaDeMetal = constructor.construirHachaDeMetal();

        assertEquals(10, unHachaDeMetal.getFuerza());
    }

    @Test
    public void testPicoDeMaderaCon100Durabilidad(){
        Constructor constructor = new Constructor();
        Herramienta unPicoDeMadera = constructor.construirPicoDeMadera();

        assertEquals(100, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void getTestPicoDeMaderaCon2Fuerza(){
        Constructor constructor = new Constructor();
        Herramienta unPicoDeMadera = constructor.construirPicoDeMadera();

        assertEquals(2, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoaDeMetalCon400Durabilidad(){
        Constructor constructor = new Constructor();
        Herramienta unPicoDeMetal = constructor.construirPicoDeMetal();

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalCon10Fuerza(){
        Constructor constructor = new Constructor();
        Herramienta unPicoDeMetal = constructor.construirPicoDeMetal();

        assertEquals(12, unPicoDeMetal.getFuerza());
    }

    @Test
    public void testPicoFinoCon1000Durabilidad(){
        Constructor constructor = new Constructor();
        Herramienta unPicoFino = constructor.construirPicoFino();

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoCon20Fuerza(){
        Constructor constructor = new Constructor();
        Herramienta unPicoFino = constructor.construirPicoFino();

        assertEquals(20, unPicoFino.getFuerza());
    }
}
