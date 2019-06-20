package Vista.sonidos;

import Modelo.Herramientas.Herramienta;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.ArrayList;

public class InventarioHerramientaViewer extends HBox {
    private static InventarioHerramientaViewer instance;
    private ArrayList<Herramienta> inventarioHerramientas;

    public InventarioHerramientaViewer(ArrayList herramientas){
        inventarioHerramientas = herramientas;
        instance = this;
        iniciarInventario();
    }

    private InventarioHerramientaViewer iniciarInventario(){
        Image fondo = new Image("Vista/imagenes/inventario_herramientas.png");
        this.setBackground(new Background(new BackgroundImage(fondo,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT)));
        instance = this;
        return this;
    }
}
