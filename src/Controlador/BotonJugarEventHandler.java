package Controlador;

import Vista.Algocraft;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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

    }
}
