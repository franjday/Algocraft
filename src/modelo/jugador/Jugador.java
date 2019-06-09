package modelo.jugador;

import java.util.*;
import modelo.construccion.*;
import modelo.herramientas.*;
import modelo.materiales.*;
import modelo.jugador.Inventario.*;
import modelo.tablero.*;

public class Jugador implements Contenible {
    private Herramienta herramientaEquipada;
    private Inventario inventario;
    private Mapa mapa;
    private Posicion posicionActual;


    public Jugador(Mapa unMapa, Posicion posicion){
        Constructor unConstructor = new HachaMaderaConstructor();
        herramientaEquipada = unConstructor.construir();
        inventario = new Inventario();
        posicionActual = posicion;
        mapa = unMapa;
        unMapa.agregarContenido(this, posicionActual);
    }

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }

    public ArrayList getInventarioMateriales(){
        return inventario.getMateriales();
    }

    public ArrayList getInventarioHerramientas(){ return inventario.getHerramientas(); }

    public void recolectar(Diamante Diamante){
        herramientaEquipada.recolectar(Diamante);
        if(herramientaEquipada.estaRota()){
            inventario.EliminarHerramienta();
        }
        if(Diamante.SePuedeRecolectar()){
            inventario.RecolectarMaterial();
        }

    }

    public void moverArriba(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.subirEnY();

        mapa.moverObjeto(posicionActual, nuevaPosicion);
        this.posicionActual = nuevaPosicion;
    }

    public void moverAbajo(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.bajarEnY();

        mapa.moverObjeto(posicionActual, nuevaPosicion);
        this.posicionActual = nuevaPosicion;
    }

    public void moverIzquierda(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.bajarEnX();

        mapa.moverObjeto(posicionActual, nuevaPosicion);
        this.posicionActual = nuevaPosicion;
    }

    public void moverDerecha(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.subirEnX();

        mapa.moverObjeto(posicionActual, nuevaPosicion);
        this.posicionActual = nuevaPosicion;
    }
}