
package paquete04o;

public class TransporteMaritimo extends Transporte{
    private String barco;
     public void establecerBarco(String n) {
        barco = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 100.00 + 0.30;
    }

    public String obtenerBarco() {
        return barco;
    }
}
