package Modelo.Recetas;

import Modelo.Excepciones.*;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class Recetas {

    //Simula ser solo la receta,
    private final static int TAMANO_ARRAY = 9;


    //Diccionario[patron] : constructor
    private static HashMap<ArrayList<Material>, Herramienta> Recetas = new HashMap<>();

    public void agregarReceta(Material material1, Material material2, Material material3, Material material4,
                              Material material5 , Material material6,  Material material7,  Material material8,
                              Material material9, Herramienta herramienta){

        Material[] patronDeReceta = new Material[]{material1, material2, material3, material4, material5,
                                                   material6, material7, material8, material9};

        ArrayList<Material> inputReceta = new ArrayList<>(Arrays.asList(patronDeReceta));
        Recetas.put(inputReceta, herramienta);
    }

    //TODO falta contruir herramienta
/*    public Herramienta construirHerramienta(ArrayList<Material> receta){
        if(Recetas.containsKey(receta)){
            return Recetas.get(receta);
        }
        return null;
    }
**/
    public Herramienta buscarReceta(ArrayList<Material> nuevaReceta){
        for(ArrayList<Material> receta : Recetas.keySet()){
            if(compararRecetas(nuevaReceta, receta)){
                return Recetas.get(receta);
            }
        }
        throw new RecetaInvalida();
    }

    private boolean compararRecetas(ArrayList<Material> receta1, ArrayList<Material> receta2){
        for(int i = 0; i < TAMANO_ARRAY; i++){
            if(receta1.get(i).getClass() != receta2.get(i).getClass()){
                return false;
            }
        }
        return true;
    }

}
