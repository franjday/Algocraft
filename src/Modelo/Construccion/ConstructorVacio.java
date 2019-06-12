package modelo.construccion;

import modelo.desgaste.DesgastableFino;
import modelo.herramientas.*;

public class ConstructorVacio extends Constructor {

    //Singleton
    private static Constructor instancia = new ConstructorVacio();
    public static Constructor getInstance(){
        return instancia;
    }

    //clase auxiliar que se usara en caso de que se necesite un constructor que no tenga efecto.
    //Por ejemplo en el caso de que no hayan coincidencias con el patron ingresado.

    public Herramienta construir(){

        //TODO: anular el efecto de este método. Lanzar excepcion?

        return new PicoDeMetal(10,10,new DesgastableFino());
        //Devuelve un pico cualquiera que valide el metodo, pero no se deberia poder
    }
}
