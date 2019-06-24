package Controlador;

import Modelo.Jugador.Jugador;
import Vista.MapaViewer;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

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
        MapaViewer mapaView = MapaViewer.getInstance();
        mapaView.actualizarMapaView();
    }
}
