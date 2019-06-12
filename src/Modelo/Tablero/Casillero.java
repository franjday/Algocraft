package modelo.tablero;

import modelo.excepciones.CasilleroOcupado;

public class Casillero {
    private boolean casilleroOcupado = false;
    private Contenible contenido;

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
