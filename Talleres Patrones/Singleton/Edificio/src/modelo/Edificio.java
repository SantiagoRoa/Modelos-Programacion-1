/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiantes
 */
public class Edificio {

    private static Edificio instancia;
    private String direccion;

    private Edificio(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public static Edificio getInstancia(String direccion) {
        if (instancia == null) {
            instancia = new Edificio(direccion);
        }
        return instancia;
    }

}
