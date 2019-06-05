import modelo.material.*;
import org.junit.Test;

public class MaderaTest {

    @Test
    public void testMaderaGolpeadaConUnHachaDeMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Material unaMadera = new Madera();

        unHachaDeMadera.golpear(unaMadera);

        assertEquals(8, unaMadera.getDurabilidad());
    }

}