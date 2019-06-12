package Modelo.Desgastes;

public class DesgastableLineal implements Desgastable {
    protected double coeficienteDesgaste;

    public DesgastableLineal(double coeficienteDesgaste){
        this.coeficienteDesgaste = coeficienteDesgaste;
    }

    @Override
    public double desgastar(int durabilidad){
        if(durabilidad - coeficienteDesgaste < 0){
            return 0;
        }
        return durabilidad - coeficienteDesgaste;
    }
}
