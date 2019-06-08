package modelo.desgaste;

public class DesgastableFino implements Desgastable {

    @Override
    public double desgastar(int durabilidadActual){
        return durabilidadActual - durabilidadActual*0.1;
    }
}
