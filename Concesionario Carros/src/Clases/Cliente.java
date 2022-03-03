package Clases;

import Carros.Carro;
import Carros.Color;
import javax.swing.*;

public class Cliente {

    public static void menu() {
        String marcas[] = {"Acura", "Porsche", "Rolls Royce"};
        String marca = (String) JOptionPane.showInputDialog(null, "Seleccione la marca deseada",
                "Concesionario", JOptionPane.PLAIN_MESSAGE, null, marcas, marcas[0]);
        String tipos[] = {"Sedan", "Coupe", "Camioneta"};
        String tipo = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de vehículo deseado",
                "Concesionario", JOptionPane.PLAIN_MESSAGE, null, tipos, tipos[0]);
        String colores[] = {"Blanco", "Negro", "Rojo"};
        String color = (String) JOptionPane.showInputDialog(null, "Seleccione el color deseado",
                "Concesionario", JOptionPane.PLAIN_MESSAGE, null, colores, colores[0]);
        FabricaAbstracta carro = new FabricaAbstracta();
        Carro miCarro = new Carro();
        miCarro = carro.crearCarro(marca, tipo, color);
        JOptionPane.showMessageDialog(null, "Marca: " + miCarro.getMarca() + "\nModelo: " + miCarro.getModelo()
                + "\nTipo: " + miCarro.getTipo() + "\nColor: " + miCarro.getColor());

    }

    public void ejecutar() {
        menu();
    }
}
