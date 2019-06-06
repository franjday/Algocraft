import modelo.herramientas.*;
import modelo.materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PicoTest {

    @Test
    public void testPicoDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();

        assertEquals(100, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaCon2Fuerza(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();

        assertEquals(2, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();

        assertEquals(400, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalCon10Fuerza(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();

        assertEquals(12, unPicoDeMetal.getFuerza());
    }

    @Test
    public void testPicoFinoCon1000Durabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();

        assertEquals(1000, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoCon20Fuerza(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();

        assertEquals(20, unPicoFino.getFuerza());
    }

    @Test
    public void testPicoDeMaderaGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unaMadera);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unMetal);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMadera = unConstructor.construirPicoDeMadera();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unaMadera);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unaPiedra);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unMetal);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDePiedra = unConstructor.construirPicoDePiedra();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unDiamante);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();

        unPicoDeMetal.recolectar(unaMadera);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();

        unPicoDeMetal.recolectar(unaPiedra);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();

        unPicoDeMetal.recolectar(unMetal);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoDeMetal = unConstructor.construirPicoDeMetal();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();
        unPicoDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoFino.getDurabilidad();

        unPicoFino.recolectar(unaMadera);

        assertEquals(durabilidadPico, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaPiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoFino.getDurabilidad();

        unPicoFino.recolectar(unaPiedra);

        assertEquals(durabilidadPico, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoFino.getDurabilidad();
        unPicoFino.recolectar(unMetal);

        assertEquals(durabilidadPico, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Pico unPicoFino = unConstructor.construirPicoFino();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoFino.getDurabilidad();

        unPicoFino.recolectar(unDiamante);

        assertEquals( (int)(durabilidadPico - (durabilidadPico* 0.1)), unPicoFino.getDurabilidad());
    }
}
