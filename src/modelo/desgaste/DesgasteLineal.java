package modelo.desgaste;

public class DesgasteLineal implements Desgaste{
    protected double coeficienteDesgaste;

    public DesgasteLineal(double coeficienteDesgaste){
        this.coeficienteDesgaste = coeficienteDesgaste;
    }

    @Override
    public double desgastar(int durabilidad){
        return durabilidad - coeficienteDesgaste;
    }
}
