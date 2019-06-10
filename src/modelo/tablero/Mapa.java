package modelo.tablero;

import modelo.excepciones.CasilleroOcupado;
import modelo.excepciones.ExcedeLimiteDeMapa;
import modelo.jugador.Jugador;
import modelo.materiales.*;

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

    public void agregarContenidoEnArea(String material, Posicion posicionInicial, int tamano) throws CasilleroOcupado{
        if(areaOcupada(posicionInicial, tamano))
            throw new CasilleroOcupado();

        int posX = posicionInicial.getPosicionX();
        int posY = posicionInicial.getPosicionY();

        MaterialFactory materialFactory = new MaterialFactory();

        for(int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                Posicion posicion = new Posicion(posX+i, posY+j);
                Material nuevoMaterial = materialFactory.getMaterial(material);
                this.agregarContenido(nuevoMaterial, posicion);
            }
        }
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

    public void moverObjeto(Posicion origen, Posicion destino){
        Jugador jugador = (Jugador) this.getContenido(origen);

        this.agregarContenido(jugador, destino);
        this.removerContenido(origen);
    }

    private boolean areaOcupada(Posicion posicionInicial, int tamano){
        int posX = posicionInicial.getPosicionX();
        int posY = posicionInicial.getPosicionY();

        for(int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                Posicion posicion = new Posicion(posX+i, posY+j);
                if(mapa.get(posicion) == null)
                    throw new ExcedeLimiteDeMapa();

                if(mapa.get(posicion).casilleroEstaOcupado())
                    return true;
            }
        }
        return false;
    }
}
