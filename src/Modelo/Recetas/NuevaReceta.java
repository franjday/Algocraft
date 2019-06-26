package Modelo.Recetas;

import Modelo.Construccion.Constructor;
import Modelo.Construccion.ConstructorVacio;
import Modelo.Excepciones.RecetaEliminarMaterial;
import Modelo.Excepciones.RecetaIngresarMaterial;
import Modelo.Materiales.*;

public class NuevaReceta extends Receta {

    public NuevaReceta(){

        Vacio vacio = Vacio.getInstance();

        constructor = new ConstructorVacio();
        patron = new Material[]{  vacio,  vacio,  vacio,
                                  vacio,  vacio,  vacio,
                                  vacio,  vacio,  vacio };
    }

    private boolean compararConReceta(Receta recetaExterna){

        for (int i = 0; i < 9; i++ ) {
            if(patron[i].getClass() != recetaExterna.patron[i].getClass() ){ return false;}
        }
        return true;
    }

    public void setConstructor(Constructor constructor_nuevo){
        constructor = constructor_nuevo;
    }

    public void actualizarConstructor(){

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
            if(this.compararConReceta(receta)){
                this.constructor = receta.constructor;
                return;
            }
        }
        this.constructor = new ConstructorVacio();
    }



    public void ingresarMaterial(Material material, int posicion){
        if(!(patron[posicion] instanceof Vacio)){ throw new RecetaIngresarMaterial(); }
        patron[posicion] = material;
    }


    public Material eliminarMaterial(int posicion){

        if(patron[posicion] instanceof Vacio){ throw new RecetaEliminarMaterial(); }

        Material material = patron[posicion];
        patron[posicion] = Vacio.getInstance();
        return material;
    }

    public Material[] getPatron(){
        return patron;
    }
}
