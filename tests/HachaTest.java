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

        unHachaDeMadera.recolectar(unaMadera);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Piedra unaPiedra = new Piedra();

        unHachaDeMadera.recolectar(unaPiedra);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Metal unMetal= new Metal();

        unHachaDeMadera.recolectar(unMetal);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDeMaderaGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Diamante unDiamante= new Diamante();

        unHachaDeMadera.recolectar(unDiamante);

        assertEquals(98, unHachaDeMadera.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Madera unaMadera = new Madera();

        unHachaDePiedra.recolectar(unaMadera);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Piedra unaPiedra = new Piedra();

        unHachaDePiedra.recolectar(unaPiedra);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Metal unMetal= new Metal();

        unHachaDePiedra.recolectar(unMetal);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDePiedraGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Diamante unDiamante = new Diamante();

        unHachaDePiedra.recolectar(unDiamante);

        assertEquals(195, unHachaDePiedra.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Madera unaMadera = new Madera();

        unHachaDeMetal.recolectar(unaMadera);

        assertEquals(395, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaPiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Piedra unaPiedra= new Piedra();

        unHachaDeMetal.recolectar(unaPiedra);

        assertEquals(395, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Metal unMetal= new Metal();

        unHachaDeMetal.recolectar(unMetal);

        assertEquals(395, unHachaDeMetal.getDurabilidad());
    }

    @Test
    public void testHachaDeMetalGolpeaDiamante(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Diamante unDiamante = new Diamante();

        unHachaDeMetal.recolectar(unDiamante);

        assertEquals(395, unHachaDeMetal.getDurabilidad());
    }

}

