package Modelo.Juego;

import Modelo.Tablero.*;
import Modelo.Jugador.*;

public class Juego {
    private Jugador jugador;
    private Mapa mapa;
    private static Juego instance;
    private final static int
            DIMENSION_HORIZONTAL = 20,
            DIMENSION_VERTICAL = 15;

    public Juego(){
        mapa = new Mapa(DIMENSION_HORIZONTAL, DIMENSION_VERTICAL);
        Posicion posicionDelJugador = new Posicion(9,9);
        jugador = new Jugador(mapa, posicionDelJugador);
        instance = this;
        inicializarMapa(posicionDelJugador);
    }

    private void inicializarMapa(Posicion posicionDelJugador){
        mapa.agregarContenido(jugador, posicionDelJugador);
        //inicializarContenidoMadera();
        //inicializarContenidoPiedra();
        //inicializarContenidoMetal();
        //inicializarContenidoDiamante();
        inicializarRandom(posicionDelJugador);
    }

    private void inicializarRandom(Posicion posicionDelJugador){
        mapa.nuevoMapaRandom(posicionDelJugador);
    }
    private void inicializarContenidoMadera(){
        mapa.agregarContenidoEnArea("madera", 1, 1, 4);
        mapa.agregarContenidoEnArea("madera", 1, 10, 3);
    }

    private void inicializarContenidoPiedra(){
        mapa.agregarContenidoEnArea("piedra", 8, 1, 3);
        mapa.agregarContenidoEnArea("piedra", 6, 6, 2);
    }

    private void inicializarContenidoMetal(){
        mapa.agregarContenidoEnArea("metal", 17, 12, 2);
        mapa.agregarContenidoEnArea("metal", 15, 5, 3);
    }

    private void inicializarContenidoDiamante(){
        mapa.agregarContenidoEnArea("diamante", 10, 12, 2);
    }

    public Mapa getMapa() {
        return mapa;
    }

    public Jugador getJugador(){
        return this.jugador;
    }

    public static Juego getInstance(){
        return instance;
    }
}
