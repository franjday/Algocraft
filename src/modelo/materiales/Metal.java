package modelo.materiales;

public class Metal extends Material {

    //instancia genérica para guardar en las recetas
    private static Metal instancia_generica = new Metal();

    public static Metal getInstance(){
        return instancia_generica;
    }

    public Metal() {
        this.durabilidad = 50;
    }
}