package Vista;

import Modelo.Jugador.Jugador;
import Modelo.Materiales.*;
import Modelo.Tablero.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class MapaViewer extends GridPane{
    private static MapaViewer instance;
    private Mapa mapa;
    private static int ANCHO = 20;
    private static int ALTO = 20;

    public MapaViewer(Mapa mapa){
        this.mapa = mapa;
        iniciarMapa();
        instance = this;
    }

    private MapaViewer iniciarMapa(){
        for(int i = 0; i < ANCHO; i++){
            for(int j = 0; j < ALTO; j++){
                Contenible contenido = mapa.getContenido(new Posicion(i,j));
                ImageView imagenContenido = generarImagenContenido(contenido);
                this.add(imagenContenido, i, j);
            }
        }
        instance = this;
        return this;
    }

    private ImageView generarImagenContenido(Contenible contenido){
        if(contenido instanceof Madera)
            return new ImageView(new Image("Vista/imagenes/mapa/arbol.png"));

        else if(contenido instanceof Piedra)
            return new ImageView(new Image("Vista/imagenes/mapa/piedra.png"));

        else if(contenido instanceof Metal)
            return new ImageView(new Image("Vista/imagenes/mapa/metal.png"));

        else if(contenido instanceof Jugador)
            return generarImagenJugador((Jugador)contenido);

        else
            return new ImageView(new Image("Vista/imagenes/mapa/espacioVacio.png"));
    }


    private ImageView generarImagenJugador(Jugador jugador) {
        String vista = jugador.getVista();
        ImageView imagen = new ImageView(new Image("Vista/imagenes/mapa/frontChar.png"));
        switch (vista) {
            case "frente":
                imagen = new ImageView(new Image("Vista/imagenes/mapa/frontChar.png"));
                break;

            case "torso":
                imagen = new ImageView(new Image("Vista/imagenes/mapa/backChar.png"));
                break;

            case "izquierda":
                imagen = new ImageView(new Image("Vista/imagenes/mapa/leftChar.png"));
                break;

            case "derecha":
                imagen = new ImageView(new Image("Vista/imagenes/mapa/rightChar.png"));
                break;
        }
        return imagen;
    }

    public void actualizarMapaView(){
        this.getChildren().clear();
        iniciarMapa();
    }

    public static MapaViewer getInstance(){
        return instance;
    }
}
