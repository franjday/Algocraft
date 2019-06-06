import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaderaTest {

    @Test
    public void testMaderaGolpeadaConUnHachaDeMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Madera unaMadera = new Madera();

        unHachaDeMadera.recolectar(unaMadera);

        assertEquals(8, unaMadera.getDurabilidad());
    }

}