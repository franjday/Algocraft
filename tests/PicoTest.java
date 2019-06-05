import modelo.herramientas.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PicoTest {

    @Test
    public void testPicoDeMaderaCon100Durabilidad(){
        Constructor constructor = new Constructor();
        Herramienta unPicoDeMadera = constructor.construirPicoDeMadera();

        assertEquals(100, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaCon2Fuerza(){
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
