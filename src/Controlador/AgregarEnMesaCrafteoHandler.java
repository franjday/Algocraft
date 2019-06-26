package Controlador;

import Modelo.Excepciones.MaterialIngresadoEnPosicionInvalida;
import Modelo.Jugador.Jugador;
import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import Vista.MaterialesManager;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

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
        MaterialesManager materialesManager = MaterialesManager.getInstance();

        try {
            mesaDeCrafteo.ingresarMaterial(material, posicionEnMesa);
            jugador.getInventario().EliminarMaterial(material);
            materialesManager.actualizar();
        }catch(MaterialIngresadoEnPosicionInvalida e){
            alertar();
        }
    }

    private void alertar(){
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText("La posicion ya se encuentra ocupada!");
        alerta.showAndWait();
    }
}
