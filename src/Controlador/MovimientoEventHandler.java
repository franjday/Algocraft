package Controlador;

import Modelo.Jugador.Jugador;
import Vista.MapaViewer;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import static Controlador.AudioHandler.*;


public class MovimientoEventHandler implements EventHandler<KeyEvent> {


    @Override
    public void handle(KeyEvent event){
        Jugador jugador = Jugador.getInstance();
        switch(event.getCode()){
            case UP: jugador.moverArriba();
            break;
            case DOWN: jugador.moverAbajo();
            break;
            case LEFT: jugador.moverIzquierda();
            break;
            case RIGHT: jugador.moverDerecha();
            break;
        }
        caminar.setVolume(0.05);
        caminar.play();
        MapaViewer mapaView = MapaViewer.getInstance();
        mapaView.actualizarMapaView();
    }
}
