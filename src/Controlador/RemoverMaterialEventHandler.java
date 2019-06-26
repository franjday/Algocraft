package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Materiales.Material;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import Vista.MaterialesManager;
import javafx.event.ActionEvent;

public class RemoverMaterialEventHandler extends BotonEventHandler {
    private int posicion;

    public RemoverMaterialEventHandler(int posicion){
        this.posicion = posicion;
    }

    @Override
    public void handle(ActionEvent event){
        super.handle(event);
        Jugador jugador = Jugador.getInstance();
        MesaDeCrafteo mesaDeCrafteo = jugador.getMesaDeCrafteo();

        Material materialRemovido = mesaDeCrafteo.eliminarMaterial(posicion);
        jugador.obtenerMaterial(materialRemovido);

        MaterialesManager materialesManager = MaterialesManager.getInstance();
        materialesManager.actualizar();
    }
}
