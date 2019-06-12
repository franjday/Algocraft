package Modelo.Materiales;

public class Madera extends Material {

    //instancia genérica para guardar en las recetas
    private static Madera instancia_generica = new Madera();


    public static Madera getInstance(){
        return instancia_generica;
    }

    public Madera() {
        this.durabilidad = 10;
    }
}
