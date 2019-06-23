package Modelo.Jugador;

import java.util.*;
import Modelo.Construccion.*;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;
import Modelo.Tablero.*;

public class Jugador implements Contenible {
    private static String FRENTE = "frente";
    private static String TORSO = "torso";
    private static String IZQ = "izquierda";
    private static String DER = "der";
    private Herramienta herramientaEquipada;
    private Inventario inventario;
    private Mapa mapa;
    private Posicion posicionActual;
    private String vista;
    private static Jugador instance;


    public Jugador(Mapa unMapa, Posicion posicion){
        Constructor unConstructor = new HachaMaderaConstructor();
        herramientaEquipada = unConstructor.construir();
        inventario = new Inventario();
        posicionActual = posicion;
        mapa = unMapa;
        vista = FRENTE;
        instance = this;
    }

    // RELACION CON HERRAMIENTAS Y MATERIALES

    public Herramienta getHerramientaEquipada() {
        return this.herramientaEquipada;
    }

    public void equiparHerramienta(Herramienta unaHerramienta){
        this.herramientaEquipada = unaHerramienta;
    }

    public ArrayList getInventarioMateriales(){
        return inventario.getMateriales();
    }

    public ArrayList getInventarioHerramientas(){ return inventario.getHerramientas(); }

    public Herramienta removerHerramienta(int posicion){
        return inventario.eliminarHerramienta(posicion);
    }

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

        if(mapa.moverObjeto(posicionActual, nuevaPosicion)) {
            this.posicionActual = nuevaPosicion;
            vista = TORSO;
        }
    }

    public void moverAbajo(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.bajarEnY();

        if(mapa.moverObjeto(posicionActual, nuevaPosicion)){
        this.posicionActual = nuevaPosicion;
        vista = FRENTE;
        }
    }

    public void moverIzquierda(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.bajarEnX();

        if(mapa.moverObjeto(posicionActual, nuevaPosicion)){
            this.posicionActual = nuevaPosicion;
            vista = IZQ;
        }
    }

    public void moverDerecha(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.subirEnX();

        if(mapa.moverObjeto(posicionActual, nuevaPosicion)) {
            this.posicionActual = nuevaPosicion;
            vista = DER;
        }
    }

    public String getVista(){
        return this.vista;
    }

    public static Jugador getInstance(){
        return instance;
    }
}