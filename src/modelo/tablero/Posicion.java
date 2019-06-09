package modelo.tablero;

public class Posicion {
    private int posicionX;
    private int posicionY;

    public Posicion(int x, int y){
        posicionX = x;
        posicionY = y;
    }

    public Posicion(Posicion unaPosicion){
        posicionX = unaPosicion.posicionX;
        posicionY = unaPosicion.posicionY;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void subirEnX(){
        this.posicionX++;
    }

    public void bajarEnX(){
        this.posicionX--;
    }

    public void subirEnY(){
        this.posicionY++;
    }

    public void bajarEnY(){
        this.posicionY--;
    }

    public int hashCode(){
        return posicionX*posicionY;
    }

    public boolean equals(Object objeto){
        if(objeto == null)
            return false;

        Posicion otraPosicion = (Posicion) objeto;
        return ((otraPosicion.getPosicionX() == this.posicionX) && otraPosicion.getPosicionY() == this.posicionY);
    }
}
