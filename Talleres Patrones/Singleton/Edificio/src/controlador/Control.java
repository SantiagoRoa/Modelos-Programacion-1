/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Edificio;

/**
 *
 * @author estudiantes
 */
public class Control {

    public static void main(String[] args) {
        Edificio e1 = Edificio.getInstancia("Calle 123");
        Edificio e2 = Edificio.getInstancia("Calle 456");
        System.out.println(e1.getDireccion());
        System.out.println(e2.getDireccion());
    }
}
