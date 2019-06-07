package modelo.desgaste;

public class DesgasteFino implements Desgaste {

    @Override
    public double desgastar(int durabilidadActual){
        return durabilidadActual - durabilidadActual*0.1;
    }
}
