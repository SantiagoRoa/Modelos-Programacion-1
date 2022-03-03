/**
 * 28/04/2019 07:26:42 PM
 * Autor: Santiago Roa
 */
package Clases;

import javax.swing.*;

public class Graficador {

    public Antena getAntena(String tipoAntena) {
        switch (tipoAntena) {
            case ("Yagi"): {
                return new Yagi(3, 2, 1);
            }
            case ("LogPeriodica"): {
                return new LogPeriodica(8, 1, 2);
            }
            case ("MicroStrip"): {
                return new MicroStrip(16, 0, 3);
            }
        }
        return null;
    }

    public void menu() {
        String[] opciones = {"Yagi", "LogPeriodica", "MicroStrip"};
        String tipoAntena = (String) JOptionPane.showInputDialog(null, "Seleccione una antena para agregar",
                "Graficador de Antenas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        Antena nuevaAntena = new Graficador().getAntena(tipoAntena);
        JOptionPane.showMessageDialog(null, "Tipo de antena: " + tipoAntena + "\nPatron " + nuevaAntena.patronAntena + "\nPotencia: "
                + nuevaAntena.potencia + "\nSWR: " + nuevaAntena.SWR);
    }

    public void ejecutar() {
        menu(); 
    }
}
