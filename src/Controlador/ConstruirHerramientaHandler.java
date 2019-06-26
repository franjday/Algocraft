package Controlador;

import Modelo.Excepciones.RecetaInvalida;
import Modelo.Herramientas.Herramienta;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;

import Vista.HerramientaInvViewer;
import Vista.MesaDeCrafteoViewer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

import static Controlador.AudioHandler.construir;

public class ConstruirHerramientaHandler implements EventHandler<ActionEvent> {
    private MesaDeCrafteo mesa;

    public ConstruirHerramientaHandler(MesaDeCrafteo mesaDeCrafteo){
        mesa = mesaDeCrafteo;
    }

    @Override
    public void handle(ActionEvent event){
        try{
            Herramienta herramientaNueva = mesa.construirHerramienta();
            Jugador jugador = Jugador.getInstance();
            jugador.recolectarHerramienta(herramientaNueva);
            construir.play();
            actualizar();

        }catch(RecetaInvalida e){
            alertar();
        }
    }

    private void actualizar() {
        HerramientaInvViewer herramientaInvViewer = HerramientaInvViewer.getInstance();
        MesaDeCrafteoViewer mesaDeCrafteoViewer = MesaDeCrafteoViewer.getInstance();
        Jugador jugador = Jugador.getInstance();

        mesaDeCrafteoViewer.actualizar();
        herramientaInvViewer.actualizarHerramientaView(jugador.getHerramientaEquipada());
    }

    private void alertar(){
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText("Patron invalido!");
        alerta.showAndWait();
    }
}
