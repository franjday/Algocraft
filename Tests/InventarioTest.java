import modelo.construccion.*;
import modelo.herramientas.*;
import modelo.jugador.Inventario;
import modelo.jugador.Jugador;
import modelo.materiales.*;
import java.util.*;
import java.util.ArrayList;

import modelo.tablero.Mapa;
import modelo.tablero.Posicion;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class InventarioTest {

    @Test
    public void testInicializacionDelJugadorConUnaHerramienta(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        assertEquals(unJugador.getInventarioHerramientas().size(),0);
    }
    @Test
    public void testJugadarConUnaHerramientaEnElInventario() {
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha) unConstructor.construir();
        unJugador.recolectarHerramienta(unHachaDeMadera);
        assertEquals(unJugador.getInventarioHerramientas().size(),1);

    }

    @Test
    public void testJugadarConDosHerramientaEnElInventario() {
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);

        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha) unConstructor.construir();

        Constructor unConstructor2 = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico) unConstructor2.construir();

        unJugador.recolectarHerramienta(unHachaDeMadera);
        unJugador.recolectarHerramienta(unPicoDeMetal);

        assertEquals(unJugador.getInventarioHerramientas().size(),2);

    }

    @Test
    public void testSeEliminaUnaHerramientaDelInventario() {
        Inventario unInventario = new Inventario();

        Constructor unConstructor = new HachaMaderaConstructor();
        Hacha unHachaDeMadera = (Hacha) unConstructor.construir();

        Constructor unConstructor2 = new PicoMetalConstructor();
        Pico unPicoDeMetal = (Pico) unConstructor2.construir();

        unInventario.RecolectarHerramienta(unHachaDeMadera);
        unInventario.RecolectarHerramienta(unPicoDeMetal);

        assertEquals(unInventario.getHerramientas().size(),2);

        unInventario.EliminarHerramienta(unHachaDeMadera);
        assertEquals(unInventario.getHerramientas().size(),1);

        unInventario.EliminarHerramienta(unPicoDeMetal);
        assertEquals(unInventario.getHerramientas().size(),0);



    }

    @Test
    public void testSeEliminaUnMaterialDelInventario() {
        Inventario unInventario = new Inventario();
        Madera unaMadera = new Madera();
        Diamante unDiamante = new Diamante();

        unInventario.RecolectarMaterial(unaMadera);
        unInventario.RecolectarMaterial(unDiamante);

        assertEquals(unInventario.getMateriales().size(),2);

        unInventario.EliminarMaterial(unaMadera);
        assertEquals(unInventario.getMateriales().size(),1);

        unInventario.EliminarMaterial(unDiamante);
        assertEquals(unInventario.getMateriales().size(),0);



    }
}
