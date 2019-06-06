import modelo.herramientas.*;
import modelo.materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {

    @Test
    public void testHachaDeMaderaCon100Durabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();

        assertEquals(100, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaCon2Fuerza(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();

        assertEquals(2, unHachaDeMadera.getFuerza());
    }

    @Test
    public void testHachaDeMetalCon400Durabilidad(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();

        assertEquals(400, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalCon10Fuerza(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();

        assertEquals(10, unHachaDeMetal.getFuerza());
    }


    @Test
    public void testHachaDeMaderaGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Madera unaMadera = new Madera();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unaMadera);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Piedra unaPiedra = new Piedra();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unaPiedra);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Metal unMetal= new Metal();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unMetal);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Diamante unDiamante= new Diamante();

        int durabilidadHacha = unHachaDeMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unDiamante);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Madera unaMadera = new Madera();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unaMadera);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Piedra unaPiedra = new Piedra();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unaPiedra);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Metal unMetal= new Metal();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unMetal);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Diamante unDiamante = new Diamante();

        int durabilidadHacha = unHachaDePiedra.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unDiamante);

        assertEquals(durabilidadHacha - fuerzaHacha, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Madera unaMadera = new Madera();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unaMadera);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Piedra unaPiedra= new Piedra();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unaPiedra);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Metal unMetal= new Metal();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unMetal);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Diamante unDiamante = new Diamante();

        int durabilidadHacha = unHachaDeMetal.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unDiamante);

        assertEquals(durabilidadHacha - fuerzaHacha/2, unHachaDeMetal.getDurabilidad());
    }

}

