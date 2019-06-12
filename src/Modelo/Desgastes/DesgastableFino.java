package Modelo.Desgastes;

public class DesgastableFino implements Desgastable {

    @Override
    public double desgastar(int durabilidadActual){
        if((durabilidadActual - durabilidadActual*0.1) < 0){
            return 0;
        }
        return durabilidadActual - (durabilidadActual*0.1);
    }
}
