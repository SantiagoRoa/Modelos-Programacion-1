/**
 * 26/04/2019 08:25:37 PM
 * Autor: Santiago Roa
 */
package Sumatorias;

import javax.swing.JOptionPane;

public class Interfaz {

    int lim;
    int exp;

    public void preguntar() {
        lim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el límite superior"));
        exp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el exponente"));
    }

    public void MostrarRespuesta() {
        Sigma suma = new Sigma(exp, lim);
        JOptionPane.showMessageDialog(null, "El resultado de la sumatoria es: " + suma.sumarKesimo());
    }

    public void acabar() {

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea volver a ejecutar el programa?", "Atención", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == opcion) {
            ejecutar();
        }
    }

    public void ejecutar() {
        preguntar();
        MostrarRespuesta();
        acabar();
    }
}
