/**
 * 4/05/2019 02:43:36 PM
 * Autor: Santiago Roa
 */
package clases;

public class Builder {

    private Protocolo protocolo;

    public void setProtocolo(String protocolo) {
        switch (protocolo) {
            case "SPI":
                this.protocolo = new SPI();
                this.protocolo.setDireccion("100.145.47.193");
                this.protocolo.setEsclavos(2);
                this.protocolo.setVelocidad(143.1);
                break;
            case "I2C":
                this.protocolo = new I2C();
                this.protocolo.setDireccion("112.9.85.215");
                this.protocolo.setEsclavos(4);
                this.protocolo.setVelocidad(284.5);
                break;
            case "RS485":
                this.protocolo = new RS485();
                this.protocolo.setDireccion("215.135.97.236");
                this.protocolo.setEsclavos(3);
                this.protocolo.setVelocidad(601.7);
                break;
        }
    }

    public String getDireccion() {
        return this.protocolo.direccion;
    }

    public int getEsclavos() {
        return this.protocolo.esclavos;
    }

    public double getVelocidad() {
        return this.protocolo.velocidad;
    }
}
