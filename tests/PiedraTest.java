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

        int durabilidadPiedra = unaPiedra.getDurabilidad();

        unHachaDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();

        unHachaDePiedra.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDeMentalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();

        unHachaDeMetal.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConPicoDeMaderaReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra - fuerzaPico, unaPiedra.getDurabilidad());
    }

}