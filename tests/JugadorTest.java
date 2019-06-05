import modelo.herramientas.*;
import modelo.jugador.*;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void testJugadorCreadoPoseeHachaDeMadera(){
        Constructor unConstructor = new Constructor();
        Herramienta unHachaDeMadera = unConstructor.construirHachaDeMadera();
        Jugador unJugador = new Jugador(unHachaDeMadera);

        assert(unHachaDeMadera == unJugador.getHerramientaEquipada());
    }
}
