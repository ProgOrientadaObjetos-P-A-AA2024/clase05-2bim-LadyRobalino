
package paquete04o;

public class TransporteAereo extends Transporte{
    private String avion;

    public void establecerAvion(String n) {
        avion = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 80.00 + 0.10;
    }

    public String obtenerAvion() {
        return avion;
    }
}
