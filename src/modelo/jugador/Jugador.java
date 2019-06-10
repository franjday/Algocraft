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

    // RELACION CON HERRAMIENTAS Y MATERIALES

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }

    public ArrayList getInventarioMateriales(){
        return inventario.getMateriales();
    }

    public ArrayList getInventarioHerramientas(){ return inventario.getHerramientas(); }

    public void recolectar(Diamante unDiamante){
        herramientaEquipada.recolectar(unDiamante);
        if(herramientaEquipada.estaRota()){
            inventario.EliminarHerramienta(herramientaEquipada);
        }
        if(unDiamante.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unDiamante);
        }
    }

    public void recolectar(Metal unMetal){
        herramientaEquipada.recolectar(unMetal);
        if(herramientaEquipada.estaRota()){
            inventario.EliminarHerramienta(herramientaEquipada);
        }
        if(unMetal.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unMetal);
        }
    }

    public void recolectar(Piedra unaPiedra){
        herramientaEquipada.recolectar(unaPiedra);
        if(herramientaEquipada.estaRota()){
            inventario.EliminarHerramienta(herramientaEquipada);
        }
        if(unaPiedra.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unaPiedra);
        }
    }

    public void recolectar(Madera unaMadera){
        herramientaEquipada.recolectar(unaMadera);
        if(herramientaEquipada.estaRota()){
            inventario.EliminarHerramienta(herramientaEquipada);
        }
        if(unaMadera.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unaMadera);
        }
    }

    public void recolectarHerramienta(Herramienta unaHerramienta){
        inventario.RecolectarHerramienta(unaHerramienta);
    }





    //MOVIMIENTOS EN EL MAPA

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