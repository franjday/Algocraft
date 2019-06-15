import Modelo.Construccion.*;
import Modelo.Materiales.*;
import Modelo.Herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteTest {

    @Test
    public void testDiamanteGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unHachaDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unHachaDePiedra.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnHachaDeMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unHachaDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unPicoDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new PicoPiedraConstructor();
        Pico unPicoDePiedra = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unPicoDePiedra.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoDeMetal(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal= (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();
        int fuerzaPico = unPicoDeMetal.getFuerza();

        unPicoDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadDiamante , unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoFino() {
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();
        int fuerzaPico = unPicoFino.getFuerza();

        unPicoFino.recolectar(unDiamante);

        assertEquals(durabilidadDiamante - fuerzaPico, unDiamante.getDurabilidad());
    }

}