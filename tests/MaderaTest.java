import modelo.materiales.*;
import modelo.herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaderaTest {

    @Test
    public void testMaderaGolpeadaConUnHachaDeMadera(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Madera unaMadera = new Madera();

        int durabilidadMadera = unaMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unaMadera);

        assertEquals(durabilidadMadera - fuerzaHacha, unaMadera.getDurabilidad());
    }

    @Test
    public void testMaderaGolpeadaConHachaDePiedra(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDePiedra = unConstructor.construirHachaDePiedra();
        Madera unaMadera = new Madera();

        int durabilidadMadera = unaMadera.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unaMadera);

        assertEquals(durabilidadMadera - fuerzaHacha, unaMadera.getDurabilidad());
    }

    @Test
    public void testMaderaGolpeadaConHachaDeMetal(){
        Constructor unConstructor = new Constructor();
        Hacha unHachaDeMetal = unConstructor.construirHachaDeMetal();
        Madera unaMadera = new Madera();

        int durabilidadMadera = unaMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unaMadera);

        assertEquals(durabilidadMadera - fuerzaHacha, unaMadera.getDurabilidad());
    }
}