package Vista;

import Modelo.Jugador.Jugador;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import javafx.scene.layout.BorderPane;

public class MaterialesManager extends BorderPane {
    private Jugador jugador;
    private static MaterialesManager instance;
    private InventarioViewer inventarioViewer;
    private MesaDeCrafteoViewer mesaDeCrafteoViewer;

    public MaterialesManager(Jugador jugador){
        this.jugador = jugador;
        inventarioViewer = new InventarioViewer(jugador.getInventarioMateriales(), new MesaDeCrafteo());
        mesaDeCrafteoViewer = new MesaDeCrafteoViewer(jugador.getMesaDeCrafteo());
        instance = this;

        this.setCenter(inventarioViewer);
        this.setRight(mesaDeCrafteoViewer);
    }

    public void actualizar(){
        inventarioViewer.actualizar();
        mesaDeCrafteoViewer.actualizar();
    }

    public static MaterialesManager getInstance(){
        return instance;
    }
}
