import modelo.construccion.*;
import modelo.herramientas.*;
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
}
