package modelo.materiales;

public abstract class Material {
    protected int durabilidad;
    protected int HerramientaNecesaria;

    public Material(int durabilidad){
        this.durabilidad = durabilidad;
        this.HerramientaNecesaria = HerramientaNecesaria;
    }
    public void disminuirDurabilidad (int fuerza, Herramienta herramienta) {

        durabilidad -= fuerza;
    }
}
