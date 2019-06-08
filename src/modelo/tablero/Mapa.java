package modelo.tablero;

import modelo.excepciones.ExcedeLimiteDeMapa;
import modelo.excepciones.ObjetoNoMovil;
import modelo.jugador.Jugador;

import java.util.Map;
import java.util.HashMap;


public class Mapa {
    private Map<Posicion, Casillero> mapa;

    public Mapa(int x, int y){
        mapa = new HashMap<>();

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                Posicion posicion = new Posicion(i, j);
                Casillero casillero = new Casillero();
                mapa.put(posicion, casillero);
            }
        }
    }

    public void agregarContenido(Contenible nuevoContenido, Posicion posicion){
        Casillero destino = this.getCasillero(posicion);
        destino.contener(nuevoContenido);
    }

    public void removerContenido(Posicion posicion){
        Casillero casilleroLiberar = this.getCasillero(posicion);
        casilleroLiberar.removerContenido();
    }

    private Casillero getCasillero(Posicion posicion) throws ExcedeLimiteDeMapa{
        Casillero casillero = mapa.get(posicion);
        if(casillero == null)
            throw new ExcedeLimiteDeMapa();

        return casillero;
    }

    public Contenible getContenido(Posicion posicion){
        Casillero casillero = getCasillero(posicion);
        return casillero.getContenido();
    }

    public void moverObjeto(Posicion origen, Posicion destino) throws ObjetoNoMovil{
        Jugador jugador = (Jugador) this.getContenido(origen);

        this.agregarContenido(jugador, destino);
        this.removerContenido(origen);
    }
}
