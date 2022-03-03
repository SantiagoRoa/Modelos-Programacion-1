/**
 * 4/05/2019 12:50:20 PM
 * Autor: Santiago Roa
 */
package clases;

import javax.swing.JOptionPane;

public class Cliente {

    public void menu() {
        String[] opciones = {"SPI", "I2C", "RS485"};
        String protocolo = (String) JOptionPane.showInputDialog(null, "Seleccione el protocolo",
                "Protocolos", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        Builder miProtocolo = new Builder();
        miProtocolo.setProtocolo(protocolo);
        JOptionPane.showMessageDialog(null, "Protocolo " + protocolo + "\nDirección: " + miProtocolo.getDireccion() + "\nEsclavos: " + miProtocolo.getEsclavos()
                + "\nVelocidad: " + miProtocolo.getVelocidad() + " Mbps");
    }

    public void ejecutar() {
        menu();
    }
}
