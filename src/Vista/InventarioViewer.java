package Vista;

import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class InventarioViewer extends VBox {
    private static InventarioViewer instance;
    private ArrayList<Material> Materiales;
    private MesaDeCrafteo mesaDeCrafteo;
    private double OffsetX = 290;
    private double OffsetY = 77;
    private static int TAM_BOTON = 32;
    private double Hgap = 4;
    private double Vgap = 4;
    private String MADERA = "botonMadera";
    private String PIEDRA = "botonPiedra";
    private String METAL = "botonMetal";
    private String DIAMANTE = "botonDiamante";

    public InventarioViewer(ArrayList<Material> materiales, MesaDeCrafteo mesa){
        this.Materiales = materiales;
        this.mesaDeCrafteo = mesa;
        instance = this;
        configurarVentana();
        HBox box = new HBox();
        configurarHBox(box);
        HBox box2 = new HBox();
        configurarHBox(box2);
        HBox box3 = new HBox();
        configurarHBox(box3);
        this.getChildren().addAll(box, box2, box3);

    }

    private void configurarVentana(){
        this.setSpacing(Vgap);
        this.setAlignment(Pos.CENTER);
        this.getStylesheets().add("Vista/styleInventario.css");
        this.setId("inventario");
    }

    private void configurarHBox(HBox hbox){
        hbox.setSpacing(Hgap);
        hbox.setTranslateX(OffsetX);
        hbox.setTranslateY(OffsetY);
        hbox.setPadding(Insets.EMPTY);
    }

    private void configurarBoton(Button unBoton, String Id){
        unBoton.setMinSize(TAM_BOTON, TAM_BOTON);
        unBoton.setId(Id);
    }

    public static InventarioViewer getInstance(){
        return instance;
    }
}
