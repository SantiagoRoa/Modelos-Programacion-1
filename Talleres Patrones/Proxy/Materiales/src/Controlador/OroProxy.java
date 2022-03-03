/*
 * Autor: Nelson Santiago Roa Garzón
 * 16/02/2020 08:05:07 PM
 */
package Controlador;

public class OroProxy extends Material {

    private Oro oro;

    OroProxy() {
        oro = new Oro();
    }

    @Override
    public void cargarse() {
        oro.cargarse();
    }

    @Override
    public void purificarse() {
        oro.purificarse();
    }

    @Override
    public void descargarse() {
        oro.descargarse();
    }

    @Override
    public void mostrar() {
        oro.mostrar();
    }

}
