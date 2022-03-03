/*
 * Autor: Nelson Santiago Roa Garzón
 * 16/02/2020 05:51:49 PM
 */
package Controlador;

public class Oro extends Material {

    public Oro() {
        this.masa = "15.000 Kg";
        this.pureza = "98,7%";
    }

    @Override
    public void cargarse() {
        System.out.println("Se carga el Oro");
    }

    @Override
    public void purificarse() {
        System.out.println("Se purifica el oro");
    }

    @Override
    public void descargarse() {
        System.out.println("Se descarga el Oro");
    }

    @Override
    public void mostrar() {
        System.out.println("Cantidad: " + this.masa);
        System.out.println("Pureza: " + this.pureza);
    }

}
