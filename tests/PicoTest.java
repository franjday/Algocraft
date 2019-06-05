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
}
