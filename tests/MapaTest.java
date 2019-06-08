import modelo.jugador.Jugador;
import modelo.tablero.Mapa;
import modelo.tablero.Posicion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapaTest {

    @Test
    public void testOcuparCasilleroVacioConPersonaje(){
        Mapa unMapa = new Mapa(3, 3);
        Jugador unJugador = new Jugador();
        Posicion unaPosicion = new Posicion(0, 0);

        unMapa.agregarContenido(unJugador, unaPosicion);

        assertEquals(unJugador, unMapa.getContenido(unaPosicion));
    }
}
