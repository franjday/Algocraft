package Modelo.Herramientas;
import Modelo.Excepciones.SinHerramientaEquipada;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;

public class SinHerramienta extends Herramienta {
    @Override
    public void recolectar(Madera unaMadera){
        throw new SinHerramientaEquipada();
    }

    @Override
    public void recolectar(Piedra unaPiedra){
        throw new SinHerramientaEquipada();
    }

    @Override
    public void recolectar(Metal unMetal){
        throw new SinHerramientaEquipada();
    }

    @Override
    public void recolectar(Diamante unDiamante){
        throw new SinHerramientaEquipada();
    }
}
