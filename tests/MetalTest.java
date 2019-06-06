import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetalTest {
    @Test
    public void testMetalGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unHachaDeMadera.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }

    @Test
    public void testMetalGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unHachaDePiedra.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }

    @Test
    public void testMetalGolpeadaConUnHachaDeMentalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unHachaDeMetal.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }
    
    @Test
    public void testMetalGolpeadoConPicoDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unPicoDeMadera.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }
}
