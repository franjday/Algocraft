import Modelo.Excepciones.CasilleroOcupado;
import Modelo.Excepciones.ExcedeLimiteDeMapa;
import Modelo.Herramientas.*;
import Modelo.Jugador.*;
import Modelo.Materiales.*;
import Modelo.Tablero.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JugadorTest {

    @Test
    public void testJugadorCreadoPoseeHachaDeMadera(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Herramienta hachaDeJugador = unJugador.getHerramientaEquipada();

        assert(hachaDeJugador instanceof Herramienta);
    }

    @Test
    public void testJugadorMueveArriba(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(3, 4);

        unMapa.agregarContenido(unJugador, unaPosicion);
        unJugador.moverArriba();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorMueveAbajo(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(3, 2);

        unMapa.agregarContenido(unJugador, unaPosicion);
        unJugador.moverAbajo();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorMueveIzquierda(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(2, 3);

        unMapa.agregarContenido(unJugador, unaPosicion);
        unJugador.moverIzquierda();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorMueveDerecha(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(4, 3);

        unMapa.agregarContenido(unJugador, unaPosicion);
        unJugador.moverDerecha();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorIntentaMoverseACasilleroOcupado(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion posicionJugador = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, posicionJugador);

        Posicion posicionMadera = new Posicion(4, 3);
        Madera unaMadera = new Madera();

        unMapa.agregarContenido(unaMadera, posicionMadera);
        unMapa.agregarContenido(unJugador, posicionJugador);
        unJugador.moverDerecha();

        assertEquals(unJugador, unMapa.getContenido(posicionJugador));
    }

    @Test(expected = ExcedeLimiteDeMapa.class)
    public void testJugadorIntentaMoverseFueraDelMapa(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion posicionJugador = new Posicion(0, 0);
        Jugador unJugador = new Jugador(unMapa, posicionJugador);

        unJugador.moverAbajo();
    }

    @Test
    public void testMovimientoExitosoLuegoDeIntentarMoverseACasilleroOcupado(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion posicionJugador = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, posicionJugador);
        Posicion nuevaPosicion = new Posicion(3, 4);

        Posicion posicionMadera = new Posicion(4, 3);
        Madera unaMadera = new Madera();

        unMapa.agregarContenido(unaMadera, posicionMadera);
        unMapa.agregarContenido(unJugador, posicionJugador);
        unJugador.moverDerecha();
        unJugador.moverArriba();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
        assertEquals(unaMadera, unMapa.getContenido(posicionMadera));
    }

    @Test
    public void testJugadorSeMueveYLuegoVuelvePosicionOriginal(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion posicionJugador = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, posicionJugador);
        Posicion nuevaPosicion = new Posicion(3, 4);

        unMapa.agregarContenido(unJugador, posicionJugador);
        unJugador.moverArriba();
        unJugador.moverAbajo();

        assertEquals(unJugador, unMapa.getContenido(posicionJugador));
        assertNull(unMapa.getContenido(nuevaPosicion));
    }
}
