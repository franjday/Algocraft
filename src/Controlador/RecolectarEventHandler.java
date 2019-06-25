package Controlador;

import Modelo.Excepciones.ExcedeLimiteDeMapa;
import Modelo.Excepciones.SinHerramientaEquipada;
import Modelo.Juego.Juego;
import Modelo.Jugador.Jugador;
import Modelo.Materiales.*;
import Modelo.Tablero.*;
import Vista.HerramientaInvViewer;
import Vista.MapaViewer;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyEvent;

import static Controlador.AudioHandler.*;

public class RecolectarEventHandler implements EventHandler<KeyEvent> {


    @Override
    public void handle(KeyEvent event){
        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();

        Posicion posicionJugador = jugador.getPosicionActual();
        Posicion posicionObjetivo = new Posicion(posicionJugador);

        switch (jugador.getVista()){
            case "frente":
                posicionObjetivo.aumentarEnY();
                break;
            case "torso":
                posicionObjetivo.disminuirEnY();
                break;
            case "izquierda":
                posicionObjetivo.disminuirEnX();
                break;
            case "derecha":
                posicionObjetivo.aumentarEnX();
                break;
        }

        Mapa mapa = juego.getMapa();
        try {
            if (mapa.casilleroOcupado(posicionObjetivo)) {
                Contenible contenido = mapa.getContenido(posicionObjetivo);
                talar.setVolume(0.05);
                minar.setVolume(0.05);

                if (contenido instanceof Madera) {
                    jugador.recolectar((Madera) contenido);
                    talar.play();
                } else if (contenido instanceof Piedra) {
                    jugador.recolectar((Piedra) contenido);
                    minar.play();
                } else if (contenido instanceof Metal) {
                    jugador.recolectar((Metal) contenido);
                    minar.play();
                } else if (contenido instanceof Diamante) {
                    jugador.recolectar((Diamante) contenido);
                    minar.play();
                }
                mapa.recolectarMaterial(posicionObjetivo);

                MapaViewer mapaView = MapaViewer.getInstance();
                mapaView.actualizarMapaView();

                HerramientaInvViewer herramientasView = HerramientaInvViewer.getInstance();
                herramientasView.actualizarHerramientaView(jugador.getHerramientaEquipada());
            }else{
                fallar.setVolume(0.05);
                fallar.play();
            }

        }catch(ExcedeLimiteDeMapa e){}
        catch (SinHerramientaEquipada e){
            alertar();
        }
    }
    private void alertar(){
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText("No posees herramienta equipada!");
        alerta.showAndWait();
    }
}
