package Controlador;

import Vista.Algocraft;
import Vista.JuegoViewer;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class BotonJugarEventHandler extends BotonEventHandler {
    private Stage primaryStage;
    private Algocraft app;

    public BotonJugarEventHandler(Algocraft app, Stage primaryStage){
        super();
        this.primaryStage = primaryStage;
        this.app = app;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        super.handle(actionEvent);
        JuegoViewer juegoView = new JuegoViewer(primaryStage, app);
        juegoView.iniciarJuego();
    }
}
