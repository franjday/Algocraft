package desgaste;

public class DesgasteAbrupto extends Desgaste{
    protected int usosRestantes;

    public DesgasteAbrupto(int durabilidad, int fuerza){
        super(durabilidad, fuerza);
        this.usosRestantes = 10;
    }

    @Override
    public void desgastar() {
        usosRestantes--;
    }
}
