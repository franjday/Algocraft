import Modelo.Construccion.*;
import Modelo.Materiales.*;
import Modelo.Herramientas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaderaTest {

    @Test
    public void testMaderaGolpeadaConUnHachaDeMadera(){
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadMadera = unaMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMadera.getFuerza();

        unHachaDeMadera.recolectar(unaMadera);

        assertEquals(durabilidadMadera - fuerzaHacha, unaMadera.getDurabilidad());
    }

    @Test
    public void testMaderaGolpeadaConHachaDePiedra(){
        Constructor unConstructor = new HachaPiedraConstructor();
        Hacha unHachaDePiedra = (Hacha)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadMadera = unaMadera.getDurabilidad();
        int fuerzaHacha = unHachaDePiedra.getFuerza();

        unHachaDePiedra.recolectar(unaMadera);

        assertEquals(durabilidadMadera - fuerzaHacha, unaMadera.getDurabilidad());
    }

    @Test
    public void testMaderaGolpeadaConHachaDeMetal(){
        Constructor unConstructor = new HachaMetalConstructor();
        Hacha unHachaDeMetal = (Hacha)unConstructor.construir();
        Madera unaMadera = new Madera();

        int durabilidadMadera = unaMadera.getDurabilidad();
        int fuerzaHacha = unHachaDeMetal.getFuerza();

        unHachaDeMetal.recolectar(unaMadera);

        assertEquals(durabilidadMadera - fuerzaHacha, unaMadera.getDurabilidad());
    }
}