
import Modelo.MesaDeCrafteo.*;
import Modelo.Herramientas.*;
import Modelo.Materiales.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MesaDeCrafteoTest {

    @Test
    public void CrearPicoMaderaTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();

        mesa.ingresar_material(madera,0);
        mesa.ingresar_material(madera,1);
        mesa.ingresar_material(madera,2);
        mesa.ingresar_material(madera,4);
        mesa.ingresar_material(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.craftear() instanceof PicoDeMadera);
    }

    @Test
    public void CrearPicoPiedraTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();

        mesa.ingresar_material(piedra,0);
        mesa.ingresar_material(piedra,1);
        mesa.ingresar_material(piedra,2);
        mesa.ingresar_material(madera,4);
        mesa.ingresar_material(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.craftear() instanceof PicoDePiedra);
    }

    @Test
    public void CrearPicoMetalTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();

        mesa.ingresar_material(metal,0);
        mesa.ingresar_material(metal,1);
        mesa.ingresar_material(metal,2);
        mesa.ingresar_material(madera,4);
        mesa.ingresar_material(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.craftear() instanceof PicoDeMetal);
    }

    @Test
    public void CrearPicoFinoTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Metal metal = Metal.getInstance();

        mesa.ingresar_material(metal,0);
        mesa.ingresar_material(metal,1);
        mesa.ingresar_material(metal,2);
        mesa.ingresar_material(piedra,3);
        mesa.ingresar_material(madera,4);
        mesa.ingresar_material(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.craftear() instanceof PicoFino);
    }

}
