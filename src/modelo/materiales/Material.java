package modelo.materiales;

public abstract class Material {
    protected int durabilidad;

    public int getDurabilidad(){
        return this.durabilidad;
    }
    public void disminuirDurabilidad (int golpe) {

        durabilidad -= golpe;
    }
}
