package Modelo.Materiales;

public class Diamante extends Material {

    //instancia genérica para guardar en las recetas
    private static Diamante instancia_generica = new Diamante();

    public static Diamante getInstance(){
        return instancia_generica;
    }

    public Diamante() {
        this.durabilidad = 100;
    }
}