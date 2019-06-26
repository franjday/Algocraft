package Vista;

import Controlador.BotonMaterialEventHandler;
import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class InventarioViewer extends GridPane {
    private static InventarioViewer instance;
    private ArrayList<Material> Materiales;
    private MesaDeCrafteo mesaDeCrafteo;
    private double OffsetX = 291;
    private double OffsetY = 256;
    private static int LARGO_INVENTARIO = 8;
    private static int ANCHO_INVENTARIO = 6;
    private static int TAM_BOTON = 32;
    private double Hgap = 4;
    private double Vgap = 4;
    private String MADERA = "botonMadera";
    private String PIEDRA = "botonPiedra";
    private String METAL = "botonMetal";
    private String DIAMANTE = "botonDiamante";

    public InventarioViewer(ArrayList<Material> materiales, MesaDeCrafteo mesa) {
        this.Materiales = materiales;
        this.mesaDeCrafteo = mesa;
        instance = this;
        configurarVentanaMateriales();
        iniciarInventario();
    }

    private void iniciarInventario(){
        int posFil = 0;
        int posCol = 0;
        for (Material material : Materiales) {
            Button botonMaterial = new Button();
            String Id = definirMaterial(material);
            configurarBoton(botonMaterial, Id);
            botonMaterial.setOnAction(new BotonMaterialEventHandler(botonMaterial, material));

            this.add(botonMaterial, posFil, posCol);
            posFil++;
            if (posFil > LARGO_INVENTARIO) {
                posCol++;
                posFil = 0;
            }
            if(posCol > ANCHO_INVENTARIO)
                break;
        }
    }

    private String definirMaterial(Material material) {
        if(material instanceof Madera)
            return MADERA;

        else if(material instanceof Piedra)
            return PIEDRA;

        else if(material instanceof Metal)
            return METAL;

        else
            return DIAMANTE;
    }

    private void configurarVentanaMateriales(){
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

    public void actualizar(){
        this.getChildren().clear();
        iniciarInventario();
    }
}
