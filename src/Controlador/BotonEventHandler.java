package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.AudioClip;

import java.io.File;

public class BotonEventHandler implements EventHandler<ActionEvent> {
    private static final String audioFile = "src/Vista/sonidos/click_boton.mp3";
    private static final AudioClip clickBoton = new AudioClip(new File(audioFile).toURI().toString());

    public void handle(ActionEvent actionEvent){
        clickBoton.play();
    }
}
