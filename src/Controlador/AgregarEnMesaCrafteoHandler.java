package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import Vista.MesaDeCrafteoViewer;
import javafx.event.ActionEvent;

public class AgregarEnMesaCrafteoHandler extends BotonEventHandler{
    private int posicionEnMesa;
    private Material material;

    public AgregarEnMesaCrafteoHandler(int posicionEnMesa, Material material){
        this.posicionEnMesa = posicionEnMesa;
        this.material = material;

    }

    @Override
    public void handle(ActionEvent event){
        super.handle(event);
        Jugador jugador = Jugador.getInstance();
        MesaDeCrafteo mesaDeCrafteo = jugador.getMesaDeCrafteo();
        MesaDeCrafteoViewer mesaViewer = MesaDeCrafteoViewer.getInstance();

        mesaDeCrafteo.ingresarMaterial(material, posicionEnMesa);
        mesaViewer.actualizar();

    }
}
