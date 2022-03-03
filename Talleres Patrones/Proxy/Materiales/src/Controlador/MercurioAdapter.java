/*
 * Autor: Nelson Santiago Roa Garzón
 * 16/02/2020 06:08:51 PM
 */
package Controlador;

public class MercurioAdapter extends Material {

    private Mercurio mercurio;

    public MercurioAdapter() {
        this.mercurio = new Mercurio();
    }

    @Override
    public void cargarse() {
        mercurio.envasarse();
    }

    @Override
    public void purificarse() {
        mercurio.filtrarse();
    }

    @Override
    public void descargarse() {
        mercurio.desenvasarse();
    }

    @Override
    public void mostrar() {
        System.out.println("Volumen: " + mercurio.getVolumen());
        System.out.println("Viscosidad: " + mercurio.getViscosidad());
    }

}
