package Modelo.Recetas;

import Modelo.Construccion.*;
import Modelo.Materiales.*;

public abstract class Receta {

    public Material[] receta;
    protected Constructor constructor;
    
    private boolean compararRecetas(Receta recetaExterna){

        for (int i = 0; i < 9; i++ ) {
            if(receta[i] != recetaExterna.receta[i] ){ return false;}
        }
        return true;
    }


    public Constructor coincidenciaDeRecetas(){

        Receta[] lista_de_recetas = {
                PicoMaderaReceta.getInstance(),
                PicoPiedraReceta.getInstance(),
                PicoMetalReceta.getInstance(),
                PicoFinoReceta.getInstance(),
                HachaMaderaReceta.getInstance(),
                HachaPiedraReceta.getInstance(),
                HachaMetalReceta.getInstance(),
        };
        for (Receta receta_almacenada: lista_de_recetas) {
            if(this.compararRecetas(receta_almacenada)){ return receta_almacenada.constructor; }
        }
        return ConstructorVacio.getInstance();
    }



    public void ingresarMaterial(Material material, int posicion){
        if ( posicion > 0 || posicion < 9 ) receta[posicion] = material;
    }


    public void eliminarMaterial(int posicion){ receta[posicion] = Vacio.getInstance();}
    
}
