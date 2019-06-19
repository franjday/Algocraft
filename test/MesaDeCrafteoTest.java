
import Modelo.Excepciones.RecetaInvalida;
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

        mesa.ingresarMaterial(madera,0);
        mesa.ingresarMaterial(madera,1);
        mesa.ingresarMaterial(madera,2);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof PicoDeMadera);
    }

    @Test
    public void CrearPicoPiedraTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();

        mesa.ingresarMaterial(piedra,0);
        mesa.ingresarMaterial(piedra,1);
        mesa.ingresarMaterial(piedra,2);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof PicoDePiedra);
    }

    @Test
    public void CrearPicoMetalTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();

        mesa.ingresarMaterial(metal,0);
        mesa.ingresarMaterial(metal,1);
        mesa.ingresarMaterial(metal,2);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof PicoDeMetal);
    }

    @Test
    public void CrearPicoFinoTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();
        Metal metal = Metal.getInstance();

        mesa.ingresarMaterial(metal,0);
        mesa.ingresarMaterial(metal,1);
        mesa.ingresarMaterial(metal,2);
        mesa.ingresarMaterial(piedra,3);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof PicoFino);
    }

    @Test
    public void CrearHachaMaderaTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();

        mesa.ingresarMaterial(madera,0);
        mesa.ingresarMaterial(madera,1);
        mesa.ingresarMaterial(madera,3);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof Hacha);
    }

    @Test
    public void CrearHachaPiedraTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Piedra piedra = Piedra.getInstance();

        mesa.ingresarMaterial(piedra,0);
        mesa.ingresarMaterial(piedra,1);
        mesa.ingresarMaterial(piedra,3);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof Hacha);
    }

    @Test
    public void CrearHachaMetalTest(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();
        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();

        mesa.ingresarMaterial(metal,0);
        mesa.ingresarMaterial(metal,1);
        mesa.ingresarMaterial(metal,3);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);
        //Las posiciones restantes estan preconfiguradas para que sean "Vacio"

        assert (mesa.construirHerramienta() instanceof Hacha);
    }

    @Test
    public void RecetaInvalida1(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();

        try{
            mesa.construirHerramienta();
            assert(false);
        }catch (RecetaInvalida e){
            assert(true);
        }
    }

    @Test
    public void RecetaInvalida2(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();

        Madera madera = Madera.getInstance();
        Metal metal = Metal.getInstance();

        mesa.ingresarMaterial(metal,0);
        mesa.ingresarMaterial(metal,1);
        mesa.ingresarMaterial(metal,6);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);

        try{
            mesa.construirHerramienta();
            assert(false);
        }catch (RecetaInvalida e){
            assert(true);
        }
    }

    @Test
    public void RecetaInvalida3(){

        MesaDeCrafteo mesa = new MesaDeCrafteo();

        Madera madera = Madera.getInstance();

        //Copio la patron del pico de madera
        mesa.ingresarMaterial(madera,0);
        mesa.ingresarMaterial(madera,1);
        mesa.ingresarMaterial(madera,2);
        mesa.ingresarMaterial(madera,4);
        mesa.ingresarMaterial(madera,7);

        //Al eliminar un material, ya no debería ser una patron válida
        Material material = mesa.eliminarMaterial(0);

        try{
            mesa.construirHerramienta();
            assert(false);
        }catch (RecetaInvalida e){
            assert(true);
        }
    }
}
