import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetalTest {

    @Test
    //Metal se golpea con un Pico de madera y se verifica que no se reduce la durabilidad del material.
    public void testMetalGolpeadoConUnPicoDeMaderaNoReduceSuDurabilidad() {
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Metal unMetal = new Metal();

        unPicoDeMadera.recolectar(unMetal);

        assertEquals(50, unMetal.getDurabilidad());
    }
}
