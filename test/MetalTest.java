import Modelo.Construccion.*;
import Modelo.Materiales.*;
import Modelo.Herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetalTest {
    @Test
    public void testMetalGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unHachaDeMadera.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }

    @Test
    public void testMetalGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unHachaDePiedra.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }

    @Test
    public void testMetalGolpeadaConUnHachaDeMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unHachaDeMetal.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }
    
    @Test
    public void testMetalGolpeadoConPicoDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadMetal = unMetal.getDurabilidad();

        unPicoDeMadera.recolectar(unMetal);

        assertEquals(durabilidadMetal, unMetal.getDurabilidad());
    }
}
