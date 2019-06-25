package Modelo.Tablero.Creators;

import Modelo.Materiales.Material;
import Modelo.Tablero.Parcela;
import Modelo.Tablero.Mapa;
import Modelo.Tablero.Posicion;

import java.util.HashMap;

public class AbstractCreator implements Creator{

    private int densidad;           //Densidad = 100 * ocupado/disponible
    private int radio;
    protected int probalibilidad;
    protected String clave;
    protected int anteriorRandom;
    protected AbstractCreator nextCreator;
    protected Material instanciaDeMaterial;


    public AbstractCreator(int unRadio, int unaDensidad){
        this.radio = unRadio;
        this.densidad = unaDensidad;
    }

    //Probabilidad: entero del 0 al 100
    public Boolean randomTrue(int probalibilidad){
        int rand = (int)Math.floor(Math.random()*100);
        this.setAnteriorRandom(rand);
        return rand < probalibilidad;
    }

    //La idea de esta funcion es que altere la probabilidad segun el recuento de materiales que hay alrededor
    protected void analizarTerreno(Mapa mapa, Posicion posicion){
        Parcela terreno = new Parcela(mapa,posicion,this.radio);
        HashMap<String,Integer> registro = terreno.RegistrarArea();

        if ((densidad*(2*radio+1)*(2*radio+1))/100 < registro.get(clave)) this.probalibilidad = 0;

    }

    //Si el elemento Creator actual no entra en la condicion, pasa al siguiente en la cadena.
    public Material generar(Mapa mapa, Posicion posicion) {
        analizarTerreno(mapa,posicion);
        if (randomTrue(probalibilidad)){
            return instanciaDeMaterial;
        }
        return nextCreator().generar(mapa,posicion);
    }

    public AbstractCreator nextCreator(){return this.nextCreator;}

    //Setters & getters
    protected void setAnteriorRandom(int num){this.anteriorRandom= num;}
    protected void setNextCreator(AbstractCreator unCreador){this.nextCreator = unCreador;}
    public int getAnteriorRandom() {return anteriorRandom;}
    protected int getRadio(){return radio;}
    protected int getDensidad(){return densidad;}
}
