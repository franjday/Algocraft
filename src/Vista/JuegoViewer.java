package Vista;

import Controlador.KeyPressEventHandler;
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
    private Juego juego;

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
        juego = nuevoJuego;
        Mapa mapa = nuevoJuego.getMapa();
        Jugador jugador = nuevoJuego.getJugador();

        MapaViewer mapaView = new MapaViewer(mapa);
        HerramientaInvViewer herramientasView = new HerramientaInvViewer(jugador.getInventarioHerramientas(), jugador.getHerramientaEquipada());
        herramientasView.toFront();

        MaterialesManager materialesManager = new MaterialesManager(jugador);
        materialesManager.setVisible(false);

        ControlesViewer controlesViewer = new ControlesViewer(juegoView);
        controlesViewer.toFront();

        juegoView.getChildren().addAll(mapaView, herramientasView, materialesManager, controlesViewer);

        Scene escenarioJuego = new Scene(juegoView, 1025, 675);
        escenarioJuego.getStylesheets().add("Vista/styleJuego.css");
        escenarioJuego.setOnKeyPressed(new KeyPressEventHandler());
        this.primaryStage.setScene(escenarioJuego);

        Instance = this;
    }
}
