package Vista;

import Modelo.Juego.Juego;
import Modelo.Jugador.Inventario;
import Modelo.Tablero.Mapa;
import Vista.sonidos.InventarioHerramientaViewer;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

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
        StackPane juegoView = new StackPane();
        juegoView.setId("juegoView");

        Juego nuevoJuego = new Juego();
        Mapa mapa = nuevoJuego.getMapa();
        ArrayList inventarioHerramienta = nuevoJuego.getJugador().getInventarioHerramientas();

        MapaViewer mapaView = new MapaViewer(mapa);
        InventarioHerramientaViewer herramientaView = new InventarioHerramientaViewer(inventarioHerramienta);

        juegoView.getChildren().addAll(mapaView, herramientaView);
        herramientaView.setTranslateY(409);

        Scene escenarioJuego = new Scene(juegoView, 820, 860);
        escenarioJuego.getStylesheets().add("Vista/styleJuego.css");
        this.primaryStage.setScene(escenarioJuego);

        Instance = this;
    }
}
