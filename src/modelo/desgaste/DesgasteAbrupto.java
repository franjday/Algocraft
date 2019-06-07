package modelo.desgaste;

public class DesgasteAbrupto implements Desgaste{
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
