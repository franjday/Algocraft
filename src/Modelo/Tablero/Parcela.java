package Modelo.Tablero;

import Modelo.Excepciones.ExcedeLimiteDeMapa;
import Modelo.Materiales.*;

import java.util.HashMap;

public class Parcela {

    private HashMap<String,Integer> registroDeMateriales;
    private Mapa mapa;
    private Posicion centro;
    private int radio;

    public Parcela(Mapa unMapa, Posicion unaPosicion, int unRadio){
        mapa = unMapa;
        centro = unaPosicion;
        radio = unRadio;
        registroDeMateriales = new HashMap<>();
        registroDeMateriales.put("Madera",0);
        registroDeMateriales.put("Piedra",0);
        registroDeMateriales.put("Metal",0);
        registroDeMateriales.put("Diamante",0);
    }

    public HashMap<String,Integer> RegistrarArea(){
        for( int i = -1*radio; i <= radio; i++){
            for( int j = -1*radio; j<= radio; j++){

                int x = centro.getPosicionX()+i;
                int y = centro.getPosicionX()+j;

                Posicion posicion = new Posicion(x,y);

                try{
                    Contenible contenido = mapa.getContenido(posicion);
                    IdentificarContenible(contenido);
                }catch (ExcedeLimiteDeMapa e){

                }
            }
        }
        return registroDeMateriales;
    }

    private void IdentificarContenible(Contenible unContenible){

        if(unContenible instanceof Madera){
            int n = registroDeMateriales.get("Madera");
            registroDeMateriales.put("Madera",n+1);

        }else if(unContenible instanceof Piedra){
            int n = registroDeMateriales.get("Piedra");
            registroDeMateriales.put("Piedra",n+1);

        }else if(unContenible instanceof Metal){
            int n = registroDeMateriales.get("Metal");
            registroDeMateriales.put("Metal",n+1);

        }else if(unContenible instanceof Diamante) {
            int n = registroDeMateriales.get("Diamante");
            registroDeMateriales.put("Diamante", n+1);
        }
    }


}
