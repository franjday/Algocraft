package Vista;

import Modelo.Juego.Juego;
import Modelo.Tablero.Mapa;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JuegoViewer {
    private static JuegoViewer Instance;
    private Stage primaryStage;
    private Algocraft algocraft;

    public JuegoViewer(Stage primaryStage, Algocraft algocraft){
        this.primaryStage = primaryStage;
        this.algocraft = algocraft;
    }

    public static JuegoViewer getInstance(){
        return Instance;
    }

    public void iniciarJuego(){
        BorderPane juegoView = new BorderPane();
        juegoView.setId("juegoView");

        Juego nuevoJuego = new Juego();
        Mapa mapa = nuevoJuego.getMapa();

        MapaViewer mapaView = new MapaViewer(mapa);

        juegoView.setCenter(mapaView.getView());
        Scene escenarioJuego = new Scene(juegoView);
        escenarioJuego.getStylesheets().add("Vista/styleJuego.css");
        this.primaryStage.setScene(escenarioJuego);

        Instance = this;
    }
}
