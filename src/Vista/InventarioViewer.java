package Vista;

import Controlador.BotonHerramientaEventHandler;
import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class InventarioViewer extends GridPane {
    private static InventarioViewer instance;
    private ArrayList<Material> Materiales;
    private MesaDeCrafteo mesaDeCrafteo;

    public InventarioViewer(ArrayList<Material> materiales, MesaDeCrafteo mesa){
        this.Materiales = materiales;
        this.mesaDeCrafteo = mesa;
        instance = this;
        this.setAlignment(Pos.CENTER);
        Button boton = new Button("fag");
        boton.setOnAction(e -> new BotonHerramientaEventHandler(1, boton));
        this.add(boton, 0, 0);
    }

    public static InventarioViewer getInstance(){
        return instance;
    }
}
