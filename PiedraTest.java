import modelo.material.*;
import org.junit.Test;

public class PiedraTest {

    @Test
    public void testPiedraGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Material unaPiedra = new Piedra();

        unHachaDeMadera.golpear(unaPiedra);

        assertEquals(30, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Material unaPiedra = new Piedra();

        unHachaDePiedra.golpear(unaPiedra);

        assertEquals(30, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDeMentalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Material unaPiedra = new Piedra();

        unHachaDeMetal.golpear(unaPiedra);

        assertEquals(30, unaPiedra.getDurabilidad());
    }
}