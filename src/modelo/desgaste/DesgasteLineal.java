package modelo.desgaste;

public class DesgasteLineal extends Desgaste{
    protected double coeficienteDesgaste;

    public DesgasteLineal(double coeficienteDesgaste){
        this.coeficienteDesgaste = coeficienteDesgaste;
    }

    @Override
    public double desgastar(int durabilidad){
        return durabilidad - coeficienteDesgaste;
    }
}
