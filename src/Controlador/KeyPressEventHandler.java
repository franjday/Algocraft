package Controlador;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class KeyPressEventHandler implements EventHandler<KeyEvent> {

    @Override
    public void handle(KeyEvent event){
        switch(event.getCode()){
            case UP: case DOWN: case LEFT: case RIGHT:
                new MovimientoEventHandler().handle(event);
                break;
            case CONTROL:
                new RecolectarEventHandler().handle(event);
                break;
            case I:
                new MostrarInventarioEventHandler().handle(event);
                break;
        }
    }
}
