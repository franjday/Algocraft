package materiales;

public abstract class Material {

    protected int durabilidad;

    public void disminuirDurabilidad (int fuerza) {
        durabilidad -= fuerza;
    }
}
