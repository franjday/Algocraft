package desgaste;

public class DesgasteFino extends Desgaste {

    public DesgasteFino(int durabilidad, int fuerza){
        super(durabilidad, fuerza);
    }

    @Override
    public void desgastar(){
        durabilidad -= durabilidad*0.1;
    }
}
