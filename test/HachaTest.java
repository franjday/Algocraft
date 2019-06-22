import Modelo.Construccion.*;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {

    private final int DURABILIDADHACHAMADERA = 100;
    private final int FUERZAHACHAMADERA = 2;
    private final int DURABILIDADHACHAPIEDRA = 200;
    private final int FUERZAHACHAPIEDRA = 5;
    private final int DURABILIDADHACHAMETAL = 400;
    private final int FUERZAHACHAMETAL = 10;

    @Test
    public void testHachaDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();

        assertEquals(DURABILIDADHACHAMADERA, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaCon2Fuerza(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();

        assertEquals(FUERZAHACHAMADERA, unHachaDeMadera.getFuerza());
    }

    @Test
    public void testHachaDePiedraCon200Durabilidad(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();

        assertEquals(DURABILIDADHACHAPIEDRA, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraCon5Fuerza(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();

        assertEquals(FUERZAHACHAPIEDRA, unHachaDePiedra.getFuerza());
    }

    @Test
    public void testHachaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();

        assertEquals(DURABILIDADHACHAMETAL, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalCon10Fuerza(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();

        assertEquals(FUERZAHACHAMETAL, unHachaDeMetal.getFuerza());
    }



    @Test
    public void testHachaDeMaderaGolpeaMadera(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unaMadera);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaMetal(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Metal unMetal= new Metal();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unMetal);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Diamante unDiamante= new Diamante();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaMadera(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unaMadera);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaPiedra(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Piedra unaPiedra = new Piedra();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unaPiedra);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaMetal(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Metal unMetal= new Metal();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unMetal);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaDiamante(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unDiamante);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaMadera(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unaMadera);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaPiedra(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Piedra unaPiedra= new Piedra();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unaPiedra);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaMetal(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Metal unMetal= new Metal();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unMetal);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaDiamante(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Diamante unDiamante = new Diamante();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

}

