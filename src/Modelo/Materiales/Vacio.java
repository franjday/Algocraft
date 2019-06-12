package modelo.materiales;

public class Vacio extends Material {

    //instancia genérica para guardar en las recetas
    private static Vacio instancia_generica = new Vacio();


    public static Vacio getInstance(){
        return instancia_generica;
    }



}
