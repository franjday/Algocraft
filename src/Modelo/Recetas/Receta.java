package Modelo.Recetas;

import Modelo.Construccion.*;
import Modelo.Materiales.*;

public abstract class Receta {

    public Material[] receta;
    protected Constructor constructor;
    
    private Boolean comparar_recetas(Receta receta_externa){

        for (int i = 0; i < 9; i++ ) {

            if(receta[i] != receta_externa.receta[i] ){
                return false;
            }
        }
        return true;
    }

    public Constructor buscar_coincidencias_con_patron_actual(){

        Receta[] lista_de_recetas = {
                PicoMaderaReceta.getInstance(),
                PicoPiedraReceta.getInstance(),
                PicoMetalReceta.getInstance(),
                PicoFinoReceta.getInstance(),
                HachaMaderaReceta.getInstance(),
                HachaPiedraReceta.getInstance(),
                HachaMetalReceta.getInstance(),
        };

        //Por cada receta en la lista
        for (Receta receta_almacenada: lista_de_recetas) {
            if(this.comparar_recetas(receta_almacenada)){
                return receta_almacenada.constructor;
            }
        }
        return ConstructorVacio.getInstance();
    }

    public void ingresar_material(Material material, int posicion){
        if ( posicion < 0 || 8 < posicion ) return; //Todo: exepcion?
        receta[posicion] = material;
    }

    public Material eliminar_material(int posicion){

        Material aux = receta[posicion];
        receta[posicion] = Vacio.getInstance();
        return aux;
    }
    
}
