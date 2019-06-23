package Modelo.Jugador;

import java.util.*;
import Modelo.Construccion.*;
import Modelo.Excepciones.SinHerramientaEquipada;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;
import Modelo.Tablero.*;

public class Jugador implements Contenible {
    private static String FRENTE = "frente";
    private static String TORSO = "torso";
    private static String IZQ = "izquierda";
    private static String DER = "derecha";
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
        if(herramientaEquipada.estaRota()){
            this.herramientaEquipada = new SinHerramienta();
            throw new SinHerramientaEquipada();
        }
        herramientaEquipada.recolectar(unDiamante);

        if(unDiamante.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unDiamante);
        }
    }

    public void recolectar(Metal unMetal){
        if(herramientaEquipada.estaRota()){
            this.herramientaEquipada = new SinHerramienta();
            throw new SinHerramientaEquipada();
        }
        herramientaEquipada.recolectar(unMetal);

        if(unMetal.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unMetal);
        }
    }

    public void recolectar(Piedra unaPiedra){
        if(herramientaEquipada.estaRota()){
            this.herramientaEquipada = new SinHerramienta();
            throw new SinHerramientaEquipada();
        }
        herramientaEquipada.recolectar(unaPiedra);

        if(unaPiedra.SePuedeRecolectar()){
            inventario.RecolectarMaterial(unaPiedra);
        }
    }

    public void recolectar(Madera unaMadera){

        if(herramientaEquipada.estaRota()){
            this.herramientaEquipada = new SinHerramienta();
            throw new SinHerramientaEquipada();
        }
        herramientaEquipada.recolectar(unaMadera);

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
        nuevaPosicion.bajarEnY();

        vista = TORSO;
        if(mapa.moverObjeto(posicionActual, nuevaPosicion)) {
            this.posicionActual = nuevaPosicion;
        }
    }

    public void moverAbajo(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.subirEnY();

        vista = FRENTE;
        if(mapa.moverObjeto(posicionActual, nuevaPosicion)){
            this.posicionActual = nuevaPosicion;
        }
    }

    public void moverIzquierda(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.bajarEnX();

        vista = IZQ;
        if(mapa.moverObjeto(posicionActual, nuevaPosicion)){
            this.posicionActual = nuevaPosicion;
        }
    }

    public void moverDerecha(){
        Posicion nuevaPosicion = new Posicion(posicionActual);
        nuevaPosicion.subirEnX();

        vista = DER;
        if(mapa.moverObjeto(posicionActual, nuevaPosicion)) {
            this.posicionActual = nuevaPosicion;
        }
    }

    public String getVista(){
        return this.vista;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public static Jugador getInstance(){
        return instance;
    }
}