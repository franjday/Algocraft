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
                if(contenido instanceof Madera){
                    ImageView arbol = new ImageView(new Image("Vista/imagenes/mapa/arbol.png"));
                    this.add(arbol, i, j);
                }
                else if(contenido instanceof Piedra){
                    ImageView piedra = new ImageView(new Image("Vista/imagenes/mapa/piedra.png"));
                    this.add(piedra, i, j);
                }
                else if(contenido instanceof Metal){
                    ImageView metal = new ImageView(new Image("Vista/imagenes/mapa/metal.png"));
                    this.add(metal, i, j);
                }
                else if(contenido instanceof Jugador){
                    ImageView jugador = GenerarImagenJugador((Jugador)contenido);
                    this.add(jugador, i, j);
                }
                else{
                    ImageView espacioVacio = new ImageView(new Image("Vista/imagenes/mapa/espacioVacio.png"));
                    this.add(espacioVacio, i, j);
                }
            }
        }
        instance = this;
        return this;
    }

    private ImageView GenerarImagenJugador(Jugador jugador) {
        String vista = jugador.getVista();
        switch (vista) {
            case "frente":
                return new ImageView(new Image("Vista/imagenes/mapa/frontChar.png"));

            case "torso":
                return new ImageView(new Image("Vista/imagenes/mapa/backChar.png"));

            case "izquierda":
                return new ImageView(new Image("Vista/imagenes/mapa/leftChar.png"));

            case "derecha":
                return new ImageView(new Image("Vista/imagenes/mapa/rightChar.png"));
        }
        return new ImageView(new Image("Vista/imagenes/mapa/frontChar.png"));
    }

    public static MapaViewer getInstance(){
        return instance;
    }
}
