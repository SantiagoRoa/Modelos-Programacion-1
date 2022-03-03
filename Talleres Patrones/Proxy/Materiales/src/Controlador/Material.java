/*
 * Autor: Nelson Santiago Roa Garzón
 * 16/02/2020 05:48:14 PM
 */
package Controlador;

public abstract class Material {

    String masa;
    String pureza;

    public abstract void cargarse();

    public abstract void purificarse();

    public abstract void descargarse();

    public abstract void mostrar();
}
