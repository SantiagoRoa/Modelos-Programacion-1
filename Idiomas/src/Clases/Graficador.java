/**
 * 28/04/2019 09:55:00 PM
 * Autor: Santiago Roa
 */
package Clases;

import javax.swing.JOptionPane;

public class Graficador {

    public Numero getIdioma(String idioma) {
        switch (idioma) {
            case ("Inglés"): {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea 1-10"));
                return new Ingles(numero);
            }
            case ("Francés"): {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea 1-10"));
                return new Frances(numero);
            }
            case ("Japonés"): {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea 1-10"));
                return new Japones(numero);
            }
        }
        return null;
    }

    public void menu() {
        String[] opciones = {"Inglés", "Francés", "Japonés"};
        String idioma = (String) JOptionPane.showInputDialog(null, "Seleccione un idioma",
                "Traducir número", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        Numero miNumero = new Graficador().getIdioma(idioma);
        
        JOptionPane.showMessageDialog(null, "El número "+miNumero.numero+" en "+idioma+" es: "+miNumero.traducir());
    }
    
    public void ejecutar() {
        menu(); 
    }
    
    
}
