import modelo.excepciones.CasilleroOcupado;
import modelo.excepciones.ExcedeLimiteDeMapa;
import modelo.jugador.Jugador;
import modelo.materiales.*;
import modelo.tablero.Mapa;
import modelo.tablero.Posicion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MapaTest {

    @Test
    public void testObtenerContenidoCasilleroVacioDevuelveNull(){
        Mapa unMapa = new Mapa(3, 3);
        Posicion unaPosicion = new Posicion(0, 0);

        assertNull(unMapa.getContenido(unaPosicion));
    }

    @Test
    public void testOcuparCasilleroVacio(){
        Mapa unMapa = new Mapa(3, 3);
        Material unaMadera = new Madera();
        Posicion unaPosicion = new Posicion(0,0 );

        unMapa.agregarContenido(unaMadera, unaPosicion);

        assertEquals(unaMadera, unMapa.getContenido(unaPosicion));
    }

    @Test(expected = CasilleroOcupado.class)
    public void testOcuparCasilleroOcupado(){
        Mapa unMapa = new Mapa(3, 3);
        Posicion unaPosicion = new Posicion(0, 0);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Madera unaMadera = new Madera();

        unMapa.agregarContenido(unJugador, unaPosicion);
        unMapa.agregarContenido(unaMadera, unaPosicion);
    }

    @Test
    public void testLiberarCasilleroRemueveContenido(){
        Mapa unMapa = new Mapa(3, 3);
        Posicion unaPosicion = new Posicion(0, 0);
        Madera unaMadera = new Madera();

        unMapa.agregarContenido(unaMadera, unaPosicion);
        unMapa.removerContenido(unaPosicion);

        assertNull(unMapa.getContenido(unaPosicion));
    }

    @Test
    public void testMoverObjetoSeMueveCorrectamente(){
        Mapa unMapa = new Mapa(3, 3);
        Posicion unaPosicion = new Posicion(0, 0);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(1, 1);

        unMapa.agregarContenido(unJugador, unaPosicion);
        unMapa.moverObjeto(unaPosicion, nuevaPosicion);

        assertEquals(unJugador, unMapa.getContenido(nuevaPosicion));
    }

    @Test
    public void testAgregarContenidoEnArea(){
        Mapa unMapa = new Mapa(5, 5);

        unMapa.agregarContenidoEnArea("madera", 0,0, 3);

        int cantidadDeMaderas = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Posicion posicion = new Posicion(i, j);
                if(unMapa.getContenido(posicion) instanceof Madera)
                    cantidadDeMaderas++;
            }
        }
        assertEquals(9, cantidadDeMaderas);
    }

    @Test(expected = ExcedeLimiteDeMapa.class)
    public void testAgregarObjetoFueraDeRangoLanzaExcepcion(){
        Mapa unMapa = new Mapa(3, 3);
        Posicion unaPosicion = new Posicion(-1, -1);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);

        unMapa.agregarContenido(unJugador, unaPosicion);
    }

    @Test(expected = ExcedeLimiteDeMapa.class)
    public void testMoverObjetoAPosicionFueraDeRango(){
        Mapa unMapa = new Mapa(3, 3);
        Posicion unaPosicion = new Posicion(0, 0);
        Jugador unJugador = new Jugador(unMapa, unaPosicion);
        Posicion nuevaPosicion = new Posicion(-1, -1);

        unMapa.moverObjeto(unaPosicion, nuevaPosicion);
    }
}