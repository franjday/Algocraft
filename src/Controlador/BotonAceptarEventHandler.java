package Controlador;

import Vista.ControlesViewer;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class BotonAceptarEventHandler extends BotonEventHandler{
    private ControlesViewer controlesViewer;
    private StackPane juegoView;

    public BotonAceptarEventHandler(StackPane juegoView, ControlesViewer controlesViewer){
        this.controlesViewer = controlesViewer;
        this.juegoView = juegoView;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        super.handle(actionEvent);
        juegoView.getChildren().remove(controlesViewer);
    }
}
