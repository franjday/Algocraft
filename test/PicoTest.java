import Modelo.Construccion.*;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PicoTest {

    private final int DURABILIDADPICOMADERA = 100;
    private final int FUERZAPICOMADERA = 2;
    private final int DURABILIDADPICOPIEDRA = 200;
    private final int FUERZAPICOPIEDRA = 4;
    private final int DURABILIDADPICOMETAL = 400;
    private final int FUERZAPICOMETAL = 12;
    private final int DURABILIDADPICOFINO = 1000;
    private final int FUERZAPICOFINO = 20;

    @Test
    public void testPicoDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();

        assertEquals(DURABILIDADPICOMADERA, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaCon2Fuerza(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();

        assertEquals(FUERZAPICOMADERA, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoDePiedraCon200Durabilidad(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();

        assertEquals(DURABILIDADPICOPIEDRA, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraCon4Fuerza(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();

        assertEquals(FUERZAPICOPIEDRA, unPicoDeMadera.getFuerza());
    }

    @Test
    public void testPicoaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico)unConstructor.construir();

        assertEquals(DURABILIDADPICOMETAL, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalCon12Fuerza(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico)unConstructor.construir();

        assertEquals(FUERZAPICOMETAL, unPicoDeMetal.getFuerza());
    }

    @Test
    public void testPicoFinoCon1000Durabilidad(){
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();

        assertEquals(DURABILIDADPICOFINO, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoCon20Fuerza(){
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();

        assertEquals(FUERZAPICOFINO, unPicoFino.getFuerza());
    }

    @Test
    public void testPicoDeMaderaGolpeaMadera(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unaMadera);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaMetal(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unMetal);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new PicoMaderaConstructor();
        Pico unPicoDeMadera = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoDeMadera.getDurabilidad();
        int fuerzaPico = unPicoDeMadera.getFuerza();

        unPicoDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadPico - fuerzaPico, unPicoDeMadera.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMadera(){
        Constructor unConstructor = new PicoPiedraConstructor();
        Pico unPicoDePiedra = (Pico)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unaMadera);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaPiedra(){
        Constructor unConstructor = new PicoPiedraConstructor();
        Pico unPicoDePiedra = (Pico)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unaPiedra);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaMetal(){
        Constructor unConstructor = new PicoPiedraConstructor();
        Pico unPicoDePiedra = (Pico)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unMetal);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDePiedraGolpeaDiamante(){
        Constructor unConstructor = new PicoPiedraConstructor();
        Pico unPicoDePiedra = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoDePiedra.getDurabilidad();
        int fuerzaPico = unPicoDePiedra.getFuerza();

        unPicoDePiedra.recolectar(unDiamante);

        assertEquals( (int)(durabilidadPico - (fuerzaPico / (1.5)) ), unPicoDePiedra.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMadera(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();

        unPicoDeMetal.recolectar(unaMadera);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaPiedra(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();

        unPicoDeMetal.recolectar(unaPiedra);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaMetal(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();

        unPicoDeMetal.recolectar(unMetal);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoDeMetalGolpeaDiamante(){
        Constructor unConstructor = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoDeMetal.getDurabilidad();
        unPicoDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadPico, unPicoDeMetal.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMaderaNoReduceSuDurabilidad(){
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadPico = unPicoFino.getDurabilidad();

        unPicoFino.recolectar(unaMadera);

        assertEquals(durabilidadPico, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaPiedraNoReduceSuDurabilidad(){
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadPico = unPicoFino.getDurabilidad();

        unPicoFino.recolectar(unaPiedra);

        assertEquals(durabilidadPico, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaMetalNoReduceSuDurabilidad(){
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();
        Metal unMetal = new Metal();

        int durabilidadPico = unPicoFino.getDurabilidad();
        unPicoFino.recolectar(unMetal);

        assertEquals(durabilidadPico, unPicoFino.getDurabilidad());
    }

    @Test
    public void testPicoFinoGolpeaDiamante(){
        Constructor unConstructor = new PicoFinoConstructor();
        Pico unPicoFino = (Pico)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadPico = unPicoFino.getDurabilidad();

        unPicoFino.recolectar(unDiamante);

        assertEquals( (int)(durabilidadPico - (durabilidadPico* 0.1)), unPicoFino.getDurabilidad());
    }
}
