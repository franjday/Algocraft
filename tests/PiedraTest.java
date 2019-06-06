import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiedraTest {

    @Test
    public void testPiedraGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Piedra unaPiedra = new Piedra();

        unHachaDeMadera.recolectar(unaPiedra);

        assertEquals(30, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Piedra unaPiedra = new Piedra();

        unHachaDePiedra.recolectar(unaPiedra);

        assertEquals(30, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDeMentalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Piedra unaPiedra = new Piedra();

        unHachaDeMetal.recolectar(unaPiedra);

        assertEquals(30, unaPiedra.getDurabilidad());
    }
}