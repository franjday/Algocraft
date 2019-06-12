package modelo.materiales;

public class Piedra extends Material {

    //instancia genérica para guardar en las recetas
    private static Piedra instancia_generica = new Piedra();


    public static Piedra getInstance(){
        return instancia_generica;
    }

    public Piedra() {
        this.durabilidad = 30;
    }
}
