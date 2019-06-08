package modelo.desgaste;

public class DesgastableLineal implements Desgastable {
    protected double coeficienteDesgaste;

    public DesgastableLineal(double coeficienteDesgaste){
        this.coeficienteDesgaste = coeficienteDesgaste;
    }

    @Override
    public double desgastar(int durabilidad){
        return durabilidad - coeficienteDesgaste;
    }
}
