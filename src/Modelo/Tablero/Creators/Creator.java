package Modelo.Tablero.Creators;

import Modelo.Materiales.*;
import Modelo.Tablero.Mapa;
import Modelo.Tablero.Posicion;

//Implementacion del patrón: Chain of responsability
public interface Creator {

    Material generar(Mapa mapa, Posicion posicion);
    AbstractCreator nextCreator();
}
