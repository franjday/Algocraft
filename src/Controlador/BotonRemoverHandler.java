package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;

public class BotonRemoverHandler extends BotonEventHandler{
    private final int posicion;
    private Button boton;

    public BotonRemoverHandler(Button unBoton, int posicion){
        this.posicion = posicion;
        boton = unBoton;
        ContextMenu contextMenu = new ContextMenu();
        MenuItem remover = new MenuItem("Remover");

        remover.setOnAction(new RemoverMaterialEventHandler(posicion));

        contextMenu.getItems().add(remover);
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
