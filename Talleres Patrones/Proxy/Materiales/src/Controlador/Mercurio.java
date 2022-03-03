/*
 * Autor: Nelson Santiago Roa Garzón
 * 16/02/2020 06:02:42 PM
 */
package Controlador;

public class Mercurio {

    private String volumen;
    private String viscosidad;

    public Mercurio() {
        this.viscosidad = "0,016 u";
        this.volumen = "4500 L";
    }

    public String getVolumen() {
        return volumen;
    }

    public String getViscosidad() {
        return viscosidad;
    }

    public void envasarse() {
        System.out.println("Se envasa el Mercurio");
    }

    public void filtrarse() {
        System.out.println("Se filtra el Mercurio");
    }

    public void desenvasarse() {
        System.out.println("Se desenvasa el Mercurio");
    }
}
