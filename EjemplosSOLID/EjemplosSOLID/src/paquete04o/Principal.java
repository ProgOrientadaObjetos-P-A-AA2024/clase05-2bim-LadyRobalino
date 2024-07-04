/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04o;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        // objeto TransporteAereo;
        TransporteAereo avion = new TransporteAereo();
        avion.establecerAvion("Galapagos");
        avion.establecerTarifa();
        // objeto TransporteAereo;
        TransporteMaritimo barco = new TransporteMaritimo();
        barco.establecerBarco("Grecia");
        barco.establecerTarifa();
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        // TransporteTransvia transvia
        TransporteTransvia t1 = new TransporteTransvia();
        t1.establecerCooperativaTransvia("Rutas Loja");
        t1.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t1);
        lista.add(avion);
        lista.add(barco);
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
