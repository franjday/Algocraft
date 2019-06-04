package modelo.materiales;

public abstract class Material {
    protected int durabilidad;

    public Material(int durabilidad){
        this.durabilidad = durabilidad;
    }
    public void disminuirDurabilidad (int golpe) {
        durabilidad -= golpe;
    }
}
