package Controlador;

import Modelo.Jugador.Jugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class RecolectarEventHandler implements EventHandler<KeyEvent> {

    @Override
    public void handle(KeyEvent event){
        Jugador jugador = Jugador.getInstance();
        switch (jugador.getVista()){
            case
        }
    }
    /*if(contenido instanceof Madera){
        jugador.recolectar((Madera) contenido);
    }
                else if(contenido instanceof Piedra){
        jugador.recolectar((Piedra) contenido);
    }
                else if(contenido instanceof Metal){
        jugador.recolectar((Metal) contenido);
    }
                else if(contenido instanceof Diamante){
        jugador.recolectar((Diamante) contenido);
    }*/


}
