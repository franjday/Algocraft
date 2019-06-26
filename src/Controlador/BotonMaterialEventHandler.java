package Controlador;

import Modelo.Materiales.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;

public class BotonMaterialEventHandler extends BotonEventHandler{

    public BotonMaterialEventHandler(Button boton, Material material){
        ContextMenu contextMenu = new ContextMenu();
        iniciarContextMenu(contextMenu, material);

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

    private void iniciarContextMenu(ContextMenu contextMenu, Material material){
        int posicionMesa = 0;
        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 4; j++){
                MenuItem posicionEnMesa = new MenuItem(i + "x" + j);
                posicionEnMesa.setOnAction(new AgregarEnMesaCrafteoHandler(posicionMesa, material));
                contextMenu.getItems().add(posicionEnMesa);
                posicionMesa++;
            }
        }
    }
}
