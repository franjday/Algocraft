package modelo.desgaste;

public class DesgasteAbrupto extends Desgaste{
    private int usosRestantes;

    public DesgasteAbrupto(){
        this.usosRestantes = 10;
    }

    @Override
    public double desgastar(int durabilidad) {
        usosRestantes--;
        return durabilidad;
    }
}
