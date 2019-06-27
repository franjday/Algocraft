package Vista;

import Controlador.BotonAceptarEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class ControlesViewer extends HBox {

    public ControlesViewer(StackPane juegoView){
        this.setId("controlesView");
        Button botonAceptar = new Button();
        configurarBoton(botonAceptar, juegoView);
        this.getStylesheets().add("Vista/styleJuego.css");
        this.getChildren().add(botonAceptar);
    }

    private void configurarBoton(Button unBoton, StackPane juegoView){
        unBoton.setId("botonAceptar");
        unBoton.setOnAction(new BotonAceptarEventHandler(juegoView, this));
        unBoton.setMinSize(300, 39);
        unBoton.setTranslateX(390);
        unBoton.setTranslateY(500);
    }
}
