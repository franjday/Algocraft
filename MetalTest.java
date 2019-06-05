import modelo.material.*;
import org.junit.Test;

public class MetalTest {

    @Test
    //Metal se golpea con un Pico de madera y se verifica que no se reduce la durabilidad del material.
    public void testMetalGolpeadoConUnPicoDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Material unMetal = new Pico();

        unPicoDeMadera.golpear(unMetal);

        assertEquals(50, unMetal.getDurabilidad());
    }
