package modelo.materiales;

public class MaterialFactory {
    public Material getMaterial(String tipoDeMaterial){
        if(tipoDeMaterial.equalsIgnoreCase("MADERA"))
            return new Madera();

        else if(tipoDeMaterial.equalsIgnoreCase("PIEDRA"))
            return new Piedra();

        else if(tipoDeMaterial.equalsIgnoreCase("METAL"))
            return new Metal();

        else if(tipoDeMaterial.equalsIgnoreCase("DIAMANTE"))
            return new Diamante();

        return null;
    }
}
