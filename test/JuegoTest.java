import Modelo.Juego.*;
import Modelo.Jugador.Jugador;
import Modelo.Tablero.*;
import Modelo.Materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JuegoTest {

    @Test
    public void testJuegoInicializaCorrectamente(){
        Juego unJuego = new Juego();

        int maderas = 0;
        int piedras = 0;
        int metales = 0;
        int diamantes = 0;
        int jugadores = 0;
        Mapa mapa = unJuego.getMapa();

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                Posicion posicion = new Posicion(i, j);
                Contenible contenido = mapa.getContenido(posicion);
                if(contenido instanceof Madera)
                    maderas++;
                else if(contenido instanceof Piedra)
                    piedras++;
                else if(contenido instanceof Metal)
                    metales++;
                else if(contenido instanceof Diamante)
                    diamantes++;
                else if(contenido instanceof Jugador)
                    jugadores++;
            }
        }
        assertEquals(32, maderas);
        assertEquals(13, metales);
        assertEquals(4, diamantes);
        assertEquals(16, piedras);
        assertEquals(1, jugadores);
    }
}
