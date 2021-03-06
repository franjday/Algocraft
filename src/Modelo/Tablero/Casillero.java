package Modelo.Tablero;

import Modelo.Excepciones.CasilleroOcupado;

public class Casillero {
    private boolean casilleroOcupado = false;
    private Contenible contenido = null;

    public void contener(Contenible unContenido) throws CasilleroOcupado{
        if(this.casilleroOcupado)
            throw new CasilleroOcupado();
        this.contenido = unContenido;
        this.casilleroOcupado = true;
    }

    public Contenible getContenido(){
        return this.contenido;
    }

    public void removerContenido(){
        this.contenido = null;
        this.casilleroOcupado = false;
    }

    public boolean casilleroEstaOcupado(){
        return this.casilleroOcupado;
    }
}
