/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {

    public static void main(String[] args) {
        APIDisneyPlus disney = new APIDisneyPlus();
        disney.establecerApiKey("12345");

        APIDgo dgo = new APIDgo();
        dgo.establecerApiKey("000333");

        APINetflix api = new APINetflix();
        api.establecerApiKey("1234556");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api1.movie?api=");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api2.movie?api=");
        System.out.println(gp2.obtenerUrl());

        System.out.println("---------------------------");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(disney);
        gp3.establecerUrl("http://api3.movie?api=");
        System.out.println(gp3.obtenerUrl());

        System.out.println("---------------------------");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(dgo);
        gp4.establecerUrl("http://api4.movie?api=");
        System.out.println(gp4.obtenerUrl());

        System.out.println("---------------------------");

    }
}
