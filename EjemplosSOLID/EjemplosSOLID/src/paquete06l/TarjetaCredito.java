package paquete06l;

public class TarjetaCredito {

    private String nombre;
    private int numero;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerNumero(int m) {
        numero = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumero() {
        return numero;
    }
}
