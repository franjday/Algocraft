package Controlador;

import Vista.InventarioViewer;
import javafx.event.EventHandler;

import javafx.scene.input.KeyEvent;

public class MostrarInventarioEventHandler implements EventHandler<KeyEvent> {
    private static boolean visible = false;

    @Override
    public void handle(KeyEvent event){
        InventarioViewer inventario = InventarioViewer.getInstance();
        if(!visible)
            inventario.setVisible(true);
        else
            inventario.setVisible(false);

        visible = !visible;
    }
}
