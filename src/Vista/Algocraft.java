package Vista;


import Controlador.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class Algocraft extends Application {
    private final static int ANCHO = 820;
    private final static int ALTO = 820;
    private static MediaPlayer mediaPlayer;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Algocraft");
        Image imagenTitulo = new Image("Vista/imagenes/menu/titulo.png");
        ImageView titulo = new ImageView(imagenTitulo);

        Image imagenIcono = new Image("Vista/imagenes/menu/icono.png");

        reproducirMusica();

        BorderPane root = new BorderPane();
        BorderPane.setAlignment(titulo, Pos.CENTER);
        BorderPane.setMargin(titulo, new Insets(50,0,0,0));
        root.setTop(titulo);

        setBotones(root, primaryStage);

        Scene scene = new Scene(root, ANCHO, ALTO);
        scene.getStylesheets().add("Vista/style.css");
        primaryStage.getIcons().add(imagenIcono);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void reproducirMusica(){
        String audioFile = "src/Vista/sonidos/audio_juego.mp3";
        Media sonido = new Media(new File(audioFile).toURI().toString());
        mediaPlayer = new MediaPlayer(sonido);
        mediaPlayer.setVolume(0.05);
        mediaPlayer.play();
    }

    private void setBotones(BorderPane borderPane, Stage primaryStage){

        Button botonJugar = new Button();
        Image imagenJugar = new Image("Vista/imagenes/menu/BotonJugar.png");
        ImageView jugar = new ImageView(imagenJugar);
        botonJugar.setGraphic(jugar);
        botonJugar.setOnAction(new BotonJugarEventHandler(this, primaryStage));


        Button botonSalir = new Button();
        Image imagenSalir = new Image("Vista/imagenes/menu/BotonSalir.png");
        ImageView salir = new ImageView(imagenSalir);
        botonSalir.setGraphic(salir);
        botonSalir.setOnAction(e -> Platform.exit());

        VBox cajaBotones = new VBox(botonJugar, botonSalir);
        cajaBotones.setAlignment(Pos.CENTER);
        cajaBotones.setSpacing(60);

        borderPane.setCenter(cajaBotones);
    }
}
