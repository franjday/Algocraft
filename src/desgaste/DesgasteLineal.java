package desgaste;

public class DesgasteLineal extends Desgaste{
    protected int coeficienteDesgaste;

    public DesgasteLineal(int durabilidad, int fuerza, int coeficienteDesgaste){
        super(durabilidad, fuerza);
        this.coeficienteDesgaste = coeficienteDesgaste;
    }

    @Override
    public void desgastar(){
        durabilidad -= fuerza/coeficienteDesgaste;
    }
}
