package Vista;

import Modelo.Materiales.*;
import Modelo.Tablero.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class MapaViewer {
    private static MapaViewer instance;
    private Mapa mapa;
    private GridPane view;
    private static int ANCHO = 20;
    private static int ALTO = 20;

    public MapaViewer(Mapa mapa){
        this.mapa = mapa;
        view = iniciarMapa();
        instance = this;
    }

    private GridPane iniciarMapa(){
        GridPane mapaView = new GridPane();
        for(int i = 0; i < ANCHO; i++){
            for(int j = 0; j < ALTO; j++){
                Contenible contenido = mapa.getContenido(new Posicion(i,j));
                if(contenido instanceof Madera){
                    ImageView arbol = new ImageView(new Image("Vista/imagenes/arbol.png"));
                    mapaView.add(arbol, i, j);
                }
                else if(contenido instanceof Piedra){
                    ImageView piedra = new ImageView(new Image("Vista/imagenes/piedra.png"));
                    mapaView.add(piedra, i, j);
                }
                else if(contenido instanceof Metal){
                    ImageView metal = new ImageView(new Image("Vista/imagenes/metal.png"));
                    mapaView.add(metal, i, j);
                }
                else{
                    ImageView espacioVacio = new ImageView(new Image("Vista/imagenes/espacioVacio.png"));
                    mapaView.add(espacioVacio, i, j);
                }
            }
        }
        return mapaView;
    }

    public GridPane getView(){
        return view;
    }
}
