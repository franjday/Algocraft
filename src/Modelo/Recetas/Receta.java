package Modelo.Recetas;

import Modelo.Construccion.*;
import Modelo.Materiales.*;

public abstract class Receta {

    public Material[] receta;
    protected Constructor constructor;
    
    private boolean compararConReceta(Receta recetaExterna){

        for (int i = 0; i < 9; i++ ) {
            if(receta[i] != recetaExterna.receta[i] ){ return false;}
        }
        return true;
    }


    public Constructor coincidenciaDeRecetas(){

        Receta[] listaDeRecetas = {
                new PicoMaderaReceta(),
                new PicoPiedraReceta(),
                new PicoMetalReceta(),
                new PicoFinoReceta(),
                new HachaMaderaReceta(),
                new HachaPiedraReceta(),
                new HachaMetalReceta(),
        };
        for (Receta receta: listaDeRecetas) {
            if(this.compararConReceta(receta)){ return receta.constructor; }
        }
        return new ConstructorVacio();
    }



    public void ingresarMaterial(Material material, int posicion){
        if ( posicion > 0 || posicion < 9 ) receta[posicion] = material;
    }


    public void eliminarMaterial(int posicion){ receta[posicion] = Vacio.getInstance();}
    
}
