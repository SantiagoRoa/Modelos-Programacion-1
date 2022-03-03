/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import carro.Carro;
import color.Color;
import color.Liso;
import color.Mate;
import color.Perlado;
import color.Textura;
import javax.swing.JOptionPane;

/**
 *
 * @author jgale
 */
public class Control {
    public static void main(String[] args) {

        AbstractFactory factory = new AbstractFactory();
        FabricaColor factoryColor = new FabricaColor();
        Carro nuevoCarro = null;
        Color nuevoColor = null;
        Textura textura;

        try {
            /***INICIA SELECCION MARCA***/
            Object[] opsMarca = {"Ford", "Fiat", "BMW"};
            String seleccionMarca = (String) JOptionPane.showInputDialog(
                    null,
                    "Qué marca de carro desea crear?",
                    "Fabrica de carros",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsMarca,
                    "Ford");
            
            /***INICIA SELECCION TIPO***/
            Object[] opsTipo = {"Sedan", "Coupe", "Camioneta"};
            String seleccionTipo = (String) JOptionPane.showInputDialog(
                    null,
                    "Qué tipo de carro desea crear?",
                    "Fabrica de carros",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsTipo,
                    "Sedan");
            
            /***INICIA SELECCION COLOR***/
            Object[] opsColor = {"Rojo", "Azul", "Verde"};
            String seleccionColor = (String) JOptionPane.showInputDialog(
                    null,
                    "Qué color desea el carro?",
                    "Fabrica de carros",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsColor,
                    "Rojo");
            
            /***INICIA SELECCION TEXTURA***/
            Object[] opsTextura = {"Liso", "Perlado", "Mate"};
            String seleccionTextura = (String) JOptionPane.showInputDialog(
                    null,
                    "Qué color desea el carro?",
                    "Fabrica de carros",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsTextura,
                    "Liso");
            
            switch(seleccionTextura)
            {
                case "Perlado":
                    textura = new Perlado();
                    break;
                case "Mate":
                    textura = new Mate();
                    break;
                default:
                    textura = new Liso();
                    break;
            }
            
            
            nuevoColor = new Color();
            nuevoColor = factoryColor.getFabricaColor(seleccionColor, textura);
            //System.out.println(seleccionColor);
            //System.out.println(nuevoColor.getColor());
            
            
            
            /***ENVIO DATOS A LA FABRICA Y ME RETORNA UN CARRO ARMADO***/
            nuevoCarro = factory.crearCarro(seleccionMarca, seleccionTipo, nuevoColor);

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Se ha creado un carro!<br>"
                    + "Marca: " + nuevoCarro.getMarca()+ "<br>"
                    + "Tipo: " + nuevoCarro.getTipo() + "<br>"
                    + "Modelo: " + nuevoCarro.getModelo()+ "<br>"
                    + "Color: " + nuevoCarro.getColor()+ "<br>"
                    + "Cantidad de puertas: " + nuevoCarro.getPuertas() + "<br>"
                    + "</html>"
            );
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se ha recibido ningun dato.");
        }
    }
}
