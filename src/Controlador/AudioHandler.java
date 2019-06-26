package Controlador;

import javafx.scene.media.AudioClip;

import java.io.File;

public class AudioHandler {
    private static final String audioFile = "src/Vista/sonidos/click_boton.mp3";
    public static final AudioClip clickBoton = new AudioClip(new File(audioFile).toURI().toString());

    private static final String talarFile = "src/Vista/sonidos/talar.mp3";
    public static final AudioClip talar = new AudioClip(new File(talarFile).toURI().toString());

    private static final String fallarFile = "src/Vista/sonidos/fallar.wav";
    public static final AudioClip fallar = new AudioClip(new File(fallarFile).toURI().toString());

    private static final String minarFile = "src/Vista/sonidos/minar.mp3";
    public static final AudioClip minar = new AudioClip(new File(minarFile).toURI().toString());

    private static final String caminarFile = "src/Vista/sonidos/caminar.mp3";
    public static final AudioClip caminar = new AudioClip(new File(caminarFile).toURI().toString());

    private static final String construccionFile = "src/Vista/sonidos/construccion.mp3";
    public static final AudioClip construir = new AudioClip(new File(construccionFile).toURI().toString());
}
