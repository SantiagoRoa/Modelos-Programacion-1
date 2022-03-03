/**
 * 4/05/2019 12:50:28 PM
 * Autor: Santiago Roa
 */
package clases;

public abstract class Protocolo {

    protected String direccion;
    protected double velocidad;
    protected int esclavos;

    public abstract void setDireccion(String direccion);

    public abstract void setVelocidad(double velocidad);

    public abstract void setEsclavos(int esclavos);

}
