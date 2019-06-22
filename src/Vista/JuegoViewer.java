package Vista;

import Modelo.Juego.Juego;
import Modelo.Jugador.Jugador;
import Modelo.Tablero.Mapa;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
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
        StackPane juegoView = new StackPane();
        juegoView.setId("juegoView");

        Juego nuevoJuego = new Juego();
        Mapa mapa = nuevoJuego.getMapa();
        Jugador jugador = nuevoJuego.getJugador();

        MapaViewer mapaView = new MapaViewer(mapa);
        HerramientaInvViewer herramientasView = new HerramientaInvViewer(jugador.getInventarioHerramientas(), jugador.getHerramientaEquipada());

        juegoView.getChildren().addAll(mapaView, herramientasView);

        Scene escenarioJuego = new Scene(juegoView, 820, 860);
        escenarioJuego.getStylesheets().add("Vista/styleJuego.css");
        this.primaryStage.setScene(escenarioJuego);

        Instance = this;
    }
}
