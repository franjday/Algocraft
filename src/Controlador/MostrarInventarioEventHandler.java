package Controlador;

import Vista.InventarioViewer;
import Vista.MaterialesManager;
import javafx.event.EventHandler;

import javafx.scene.input.KeyEvent;

public class MostrarInventarioEventHandler implements EventHandler<KeyEvent> {
    private static boolean visible = false;

    @Override
    public void handle(KeyEvent event){
        //InventarioViewer inventario = InventarioViewer.getInstance();
        MaterialesManager materialesManager = MaterialesManager.getInstance();

        if(!visible) {
            materialesManager.setVisible(true);
            materialesManager.actualizar();
        }
        else{
            materialesManager.setVisible(false);
        }
        visible = !visible;
    }
}
