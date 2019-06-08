package modelo.desgaste;

public class DesgastableAbrupto implements Desgastable {


    private int usosRestantes;

    public DesgastableAbrupto(){
        this.usosRestantes = 10;
    }

    @Override
    public double desgastar(int durabilidad) {
        usosRestantes--;
        return durabilidad;
    }
}
