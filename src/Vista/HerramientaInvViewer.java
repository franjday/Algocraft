package Vista;

import Modelo.Herramientas.*;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class HerramientaInvViewer extends GridPane {
    private static HerramientaInvViewer instance;
    private ArrayList<Herramienta> invHerramientas;
    private static int TAM_IMG = 40;
    private static final int MAX_LARGO_INV = 8;

    public HerramientaInvViewer(ArrayList<Herramienta> invHerramientas, Herramienta herramientaEquipada){
        this.invHerramientas = invHerramientas;
        instance = this;
        this.setAlignment(Pos.BOTTOM_CENTER);
        iniciarView(invHerramientas, herramientaEquipada);
    }

    public HerramientaInvViewer iniciarView(ArrayList<Herramienta> invHerramientas, Herramienta herramientaEquipada){

        Button botonHerramientaEquipada = new Button();
        botonHerramientaEquipada.setMinSize(TAM_IMG+4, TAM_IMG+2);
        if(herramientaEquipada instanceof PicoDeMadera){
            botonHerramientaEquipada.setId("picoMaderaMano");
        }
        else if(herramientaEquipada instanceof PicoDePiedra){
            botonHerramientaEquipada.setId("picoPiedraMano");
        }
        else if(herramientaEquipada instanceof  PicoDeMetal){
            botonHerramientaEquipada.setId("picoMetalMano");
        }
        else if(herramientaEquipada instanceof PicoFino){
            botonHerramientaEquipada.setId("picoFinoMano");
        }
        else if(herramientaEquipada instanceof Hacha){
            botonHerramientaEquipada.setId("hachaMaderaMano");
        }
        this.add(botonHerramientaEquipada, 0, 0);

        for(int i = 0; i < MAX_LARGO_INV; i++){
            Button botonVacio = new Button();
            botonVacio.setMinSize(TAM_IMG, TAM_IMG);
            botonVacio.setId("botonVacio");
            this.add(botonVacio, i+1, 0);
        }

        for(Herramienta herramienta : invHerramientas){
            int i = 1;
            Button botonHerramienta = new Button();
            botonHerramienta.setMinSize(TAM_IMG, TAM_IMG);
            if(herramienta instanceof PicoDeMadera){
                botonHerramienta.setId("botonPicoMadera");
            }
            else if(herramienta instanceof PicoDePiedra){
                botonHerramienta.setId("botonPicoPiedra");
            }
            else if(herramienta instanceof  PicoDeMetal){
                botonHerramienta.setId("botonPicoMetal");
            }
            else if(herramienta instanceof PicoFino){
                botonHerramienta.setId("botonPicoFino");
            }
            this.add(botonHerramienta, i, 0);
            i++;
        }
        return this;
    }
}
