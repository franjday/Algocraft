package Vista;

import Modelo.Materiales.*;
import Modelo.MesaDeCrafteo.MesaDeCrafteo;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MesaDeCrafteoViewer extends GridPane {
    private static MesaDeCrafteoViewer instance;
    private MesaDeCrafteo mesa;
    private double Hgap = 4;
    private double Vgap = 4;
    private double OffsetX = 334;
    private double OffsetY = 230;
    private static int TAM_BOTON = 32;
    private static int TAM_MESA = 2;
    private String MADERA = "botonMadera";
    private String PIEDRA = "botonPiedra";
    private String METAL = "botonMetal";
    private String DIAMANTE = "botonDiamante";
    private String VACIO = "botonVacio";

    public MesaDeCrafteoViewer(MesaDeCrafteo mesaDeCrafteo){
        mesa = mesaDeCrafteo;
        instance = this;
        configurarVentanaMesa();
        visualizarMesa(mesa.getReceta());
    }

    private void visualizarMesa(Material[] receta) {
        int posFil = 0;
        int posCol = 0;
        for(Material material : receta){

            Button imagenMaterial = new Button();
            String Id = definirMaterial(material);
            configurarBoton(imagenMaterial, Id);

            this.add(imagenMaterial, posFil, posCol);
            posFil++;
            if(posFil > TAM_MESA){
                posCol++;
                posFil = 0;
            }
            if(posCol > TAM_MESA)
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

        else if(material instanceof Diamante)
            return DIAMANTE;
        else
            return VACIO;
    }

    private void configurarVentanaMesa() {
        this.setVgap(Vgap);
        this.setHgap(Hgap);
        this.getStylesheets().add("Vista/styleInventario.css");
    }

    private void configurarBoton(Button boton, String Id){
        boton.setMinSize(TAM_BOTON, TAM_BOTON);
        boton.setId(Id);
    }

    public static MesaDeCrafteoViewer getInstance() {
        return instance;
    }

    public void actualizar(){
        this.getChildren().clear();
        visualizarMesa(mesa.getReceta());
    }
}
