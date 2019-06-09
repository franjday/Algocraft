import modelo.excepciones.CasilleroOcupado;
import modelo.excepciones.ExcedeLimiteDeMapa;
import modelo.herramientas.*;
import modelo.jugador.*;
import modelo.materiales.*;
import modelo.tablero.*;
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

        unJugador.moverArriba();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorMueveAbajo(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(3, 2);

        unJugador.moverAbajo();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorMueveIzquierda(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(2, 3);

        unJugador.moverIzquierda();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testJugadorMueveDerecha(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion unaPosicion = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(4, 3);

        unJugador.moverDerecha();

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test(expected = CasilleroOcupado.class)
    public void testJugadorIntentaMoverseACasilleroOcupado(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion posicionJugador = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, posicionJugador);

        Posicion posicionMadera = new Posicion(4, 3);
        Madera unaMadera = new Madera();

        unMapa.agregarContenido(unaMadera, posicionMadera);
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

    @Test(expected = CasilleroOcupado.class)
    public void testMovimientoExitosoLuegoDeIntentarMoverseACasilleroOcupado(){
        Mapa unMapa = new Mapa(5, 5);
        Posicion posicionJugador = new Posicion(3, 3);
        Jugador unJugador = new Jugador(unMapa, posicionJugador);
        Posicion nuevaPosicion = new Posicion(3, 4);

        Posicion posicionMadera = new Posicion(4, 3);
        Madera unaMadera = new Madera();

        unMapa.agregarContenido(unaMadera, posicionMadera);
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

        unJugador.moverArriba();
        unJugador.moverAbajo();

        assertEquals(unJugador, unMapa.getContenido(posicionJugador));
        assertNull(unMapa.getContenido(nuevaPosicion));
    }
}
