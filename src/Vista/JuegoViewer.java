package Vista;

import Controlador.MovimientoEventHandler;
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

        juegoView.getChildren().addAll(mapaView, herramientasView);

        Scene escenarioJuego = new Scene(juegoView, 900, 900);
        escenarioJuego.getStylesheets().add("Vista/styleJuego.css");
        escenarioJuego.setOnKeyPressed(new MovimientoEventHandler(jugador));
        this.primaryStage.setScene(escenarioJuego);

        Instance = this;
    }

    public void actualizar(){
        StackPane juegoView = new StackPane();
        juegoView.setId("juegoView");

        MapaViewer vistaMapa = new MapaViewer(juego.getMapa());
        HerramientaInvViewer herramientaView = new HerramientaInvViewer(juego.getJugador().getInventarioHerramientas(),
                                                                        juego.getJugador().getHerramientaEquipada());

        juegoView.getChildren().addAll(vistaMapa, herramientaView);
        Scene escenarioJuego = new Scene(juegoView);
        escenarioJuego.getStylesheets().add("Vista/styleJuego.css");
        escenarioJuego.setOnKeyPressed(new MovimientoEventHandler(juego.getJugador()));
        this.primaryStage.setScene(escenarioJuego);
    }
}
