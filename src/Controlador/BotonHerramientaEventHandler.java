package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;

public class BotonHerramientaEventHandler extends BotonEventHandler {
    private int posicion;
    private Button boton;

    public BotonHerramientaEventHandler(int posicionHerramienta, Button unBoton){
        posicion = posicionHerramienta;
        this.boton = unBoton;
        ContextMenu contextMenu = new ContextMenu();
        MenuItem equipar = new MenuItem("Equipar");

        equipar.setOnAction(new EquiparHerramientaHandler(posicionHerramienta));

        contextMenu.getItems().add(equipar);
        boton.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
            @Override
            public void handle(ContextMenuEvent event) {
                contextMenu.show(boton, event.getScreenX(), event.getScreenY());
            }
        });
    }

    @Override
    public void handle(ActionEvent event){
        super.handle(event);
    }
}
