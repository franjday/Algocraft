package Controlador;

import Modelo.Herramientas.*;
import Modelo.Jugador.Jugador;
import Vista.HerramientaInvViewer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparHerramientaHandler implements EventHandler<ActionEvent> {
    private int posicion;

    public EquiparHerramientaHandler(int posicionHerramienta){
        posicion = posicionHerramienta;
    }

    @Override
    public void handle(ActionEvent event){
        Jugador jugador = Jugador.getInstance();
        Herramienta herramientaEquipada = jugador.getHerramientaEquipada();
        Herramienta herramientaEquipable = jugador.removerHerramienta(posicion);

        jugador.equiparHerramienta(herramientaEquipable);
        jugador.recolectarHerramienta(herramientaEquipada);

        HerramientaInvViewer herramientasView = HerramientaInvViewer.getInstance();
        herramientasView.actualizarHerramientaView(herramientaEquipable);
    }
}
