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

}
