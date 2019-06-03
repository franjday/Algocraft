public class Hacha extends Herramienta {

    public Hacha(int durabilidad, int fuerza) {
        this.desgaste = new Desgaste(durabilidad, fuerza);
    }
}
