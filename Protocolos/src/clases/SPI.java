/**
 * 4/05/2019 12:59:21 PM
 * Autor: Santiago Roa
 */
package clases;

public class SPI extends Protocolo {

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void setEsclavos(int esclavos) {
        this.esclavos = esclavos;
    }

}
