package Vista;

import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class InventarioViewer extends GridPane {
    private static InventarioViewer instance;
    private ArrayList<Material> Materiales;
    private MesaDeCrafteo mesaDeCrafteo;
    private double OffsetX = 290;
    private double OffsetY = 363;
    private static int TAM_INVENTARIO = 9;
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
    }

    private void configurarVentana(){
        this.setVgap(Vgap);
        this.setHgap(Hgap);
        this.getStylesheets().add("Vista/styleInventario.css");
        this.setId("inventario");
    }

    private void configurarBoton(Button unBoton, String Id){
        unBoton.setMinSize(TAM_BOTON, TAM_BOTON);
        unBoton.setTranslateX(OffsetX);
        unBoton.setTranslateY(OffsetY);
        unBoton.setId(Id);
    }

    public static InventarioViewer getInstance(){
        return instance;
    }
}
