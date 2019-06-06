import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteTest {

    @Test
    public void testDiamanteGolpeadaConUnHachaDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unHachaDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnHachaDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unHachaDePiedra.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnHachaDeMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unHachaDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoDeMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unPicoDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoDePiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();

        unPicoDePiedra.recolectar(unDiamante);

        assertEquals(durabilidadDiamante, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoDeMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal= unConstructor.construirPicoDeMetal();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();
        int fuerzaPico = unPicoDeMetal.getFuerza();

        unPicoDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadDiamante - fuerzaPico, unDiamante.getDurabilidad());
    }

    @Test
    public void testDiamanteGolpeadaConUnPicoFino(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino= unConstructor.construirPicoFino();
        Diamante unDiamante = new Diamante();

        int durabilidadDiamante = unDiamante.getDurabilidad();
        int fuerzaPico = unPicoFino.getFuerza();

        unPicoFino.recolectar(unDiamante);

        assertEquals(durabilidadDiamante - fuerzaPico, unDiamante.getDurabilidad());
    }