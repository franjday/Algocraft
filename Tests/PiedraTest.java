import modelo.construccion.*;
import modelo.construccion.HachaMaderaConstructor;
import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiedraTest {

    @Test
    public void testPiedraGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();

        unHachaDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();

        unHachaDePiedra.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConUnHachaDeMentalNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();

        unHachaDeMetal.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra, unaPiedra.getDurabilidad());
    }

    @Test
    public void testPiedraGolpeadaConPicoDeMaderaReduceSuDurabilidad(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPiedra = unaPiedra.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadPiedra - fuerzaPico, unaPiedra.getDurabilidad());
    }

}