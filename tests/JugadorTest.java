import modelo.herramientas.*;
import modelo.jugador.*;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void testJugadorCreadoPoseeHachaDeMadera(){
        Jugador unJugador = new Jugador();
        Herramienta hachaDeJugador = unJugador.getHerramientaEquipada();

        assert(hachaDeJugador instanceof Herramienta);
    }
}
