package Modelo.Tablero;

import Modelo.Excepciones.CasilleroOcupado;
import Modelo.Excepciones.ExcedeLimiteDeMapa;
import Modelo.Jugador.Jugador;
import Modelo.Materiales.*;
import Modelo.Tablero.Creators.MaderaCreator;

import java.util.Map;
import java.util.HashMap;


public class Mapa {
    private Map<Posicion, Casillero> mapa;
    private int largo_X;
    private int largo_Y;

    public Mapa(int x, int y){
        mapa = new HashMap<>();
        largo_X = x;
        largo_Y = y;
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
    public void nuevoMapaRandom(Posicion posicionJugador){

        for( int i = 0; i < largo_X; i++){
            for( int j = 0; j < largo_Y; j++){

                Posicion posicion = new Posicion(i,j);
                if(posicion.equals(posicionJugador))continue;

                MaderaCreator creador = new MaderaCreator(6,50);
                Material material = creador.generar(this,posicion);

                if(material != null) this.agregarContenido(material,posicion);
            }
        }
    }
    public void agregarContenidoEnArea(String material, int x, int y, int tamano) throws CasilleroOcupado{
        Posicion posicionInicial = new Posicion(x, y);

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

    public boolean casilleroOcupado(Posicion posicion){
        Casillero casillero = getCasillero(posicion);
        if(casillero == null)
            return false;

        return casillero.casilleroEstaOcupado();
    }

    public boolean moverObjeto(Posicion origen, Posicion destino){
        Jugador jugador = (Jugador) this.getContenido(origen);

        try{
            this.agregarContenido(jugador, destino);
            this.removerContenido(origen);
            return true;
        }catch(CasilleroOcupado | ExcedeLimiteDeMapa e){
            return false;
        }
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

    public boolean recolectarMaterial(Posicion posicionMaterial){
        Casillero casillero = getCasillero(posicionMaterial);

        if(casillero.casilleroEstaOcupado()){
            Contenible contenido = casillero.getContenido();

            if(contenido instanceof Material){
                if(((Material) contenido).SePuedeRecolectar()){
                    Jugador jugador = Jugador.getInstance();
                    removerContenido(posicionMaterial);
                    jugador.obtenerMaterial((Material)contenido);
                    return true;
                }
            }
        }
        return false;
    }
}
