package Controlador;

import Modelo.Herramientas.*;
import Modelo.Jugador.Jugador;
import Vista.HerramientaInvViewer;
import javafx.event.ActionEvent;

public class EquiparHerramientaHandler extends BotonEventHandler {
    private int posicion;

    public EquiparHerramientaHandler(int posicionHerramienta){
        posicion = posicionHerramienta;
    }

    @Override
    public void handle(ActionEvent event){
        super.handle(event);
        Jugador jugador = Jugador.getInstance();
        Herramienta herramientaEquipable = jugador.removerHerramienta(posicion);

        jugador.equiparHerramienta(herramientaEquipable);

        HerramientaInvViewer herramientasView = HerramientaInvViewer.getInstance();
        herramientasView.actualizarHerramientaView(herramientaEquipable);
    }
}
