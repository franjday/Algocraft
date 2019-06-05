import modelo.herramientas.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {

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

}
