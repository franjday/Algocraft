package Modelo.Desgastes;

public class DesgastableAbrupto implements Desgastable {


    private int usosRestantes;

    public DesgastableAbrupto(){
        this.usosRestantes = 10;
    }

    @Override
    public double desgastar(int durabilidad) {
        if(usosRestantes == 0){
            return 0;
        }
        usosRestantes--;
        return durabilidad;
    }
}
