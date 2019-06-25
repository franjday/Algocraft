import Modelo.Materiales.Madera;
import Modelo.Tablero.Parcela;
import Modelo.Tablero.Mapa;
import Modelo.Tablero.Posicion;
import org.junit.Test;


import java.util.HashMap;


public class ParcelaTest {

    @Test
    public void testContarMateriales1(){
        Mapa mapa = new Mapa(3, 3);
        Posicion centro = new Posicion(1, 1);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Posicion posicion = new Posicion(i, j);
                mapa.agregarContenido(new Madera(),posicion);
            }
        }

        Parcela parcela = new Parcela(mapa,centro,1);
        HashMap<String,Integer> registro = parcela.RegistrarArea();

        assert(registro.get("Madera") == 9);
    }
}
