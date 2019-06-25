package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static Controlador.AudioHandler.*;

public class BotonEventHandler implements EventHandler<ActionEvent> {

    public void handle(ActionEvent actionEvent){
        clickBoton.play();
    }
}
