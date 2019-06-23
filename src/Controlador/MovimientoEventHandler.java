package Controlador;

import Modelo.Jugador.Jugador;
import Vista.JuegoViewer;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class MovimientoEventHandler implements EventHandler<KeyEvent> {
    private Jugador jugador;

    public MovimientoEventHandler(Jugador jugador){
        this.jugador = jugador;
    }

    @Override
    public void handle(KeyEvent event){
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
        JuegoViewer juegoView = JuegoViewer.getInstance();
        juegoView.actualizar();
    }
}
