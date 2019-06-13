package Modelo.Construccion;

import Modelo.Desgastes.DesgastableFino;
import Modelo.Excepciones.RecetaInvalida;
import Modelo.Herramientas.*;

public class ConstructorVacio extends Constructor  {

    //Singleton
    private static Constructor instancia = new ConstructorVacio();
    public static Constructor getInstance(){
        return instancia;
    }

    //clase auxiliar que se usara en caso de que se necesite un constructor que no tenga efecto.
    //Por ejemplo en el caso de que no hayan coincidencias con el patron ingresado.

    public Herramienta construir(){

        throw new RecetaInvalida();

    }
}
