package paquete06l;

public class TarjetaCredito {

    private String nombre;
    private int numero;
    private Banco banco;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerNumero(int m) {
        numero = m;
    }
    
     public void establecerBanco(Banco m) {
        banco = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumero() {
        return numero;
    }
    public Banco obtenerBanco() {
        return banco;
    }
}
