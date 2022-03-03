/**
 * 4/05/2019 12:59:49 PM
 * Autor: Santiago Roa
 */
package clases;

public class RS485 extends Protocolo {

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
