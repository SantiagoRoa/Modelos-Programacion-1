/*
 * Autor: Nelson Santiago Roa Garzón
 * 15/02/2020 10:28:13 PM
 */
package Controlador;

public class MotorDiesel extends Motor {

    @Override
    public void Encender() {
        System.out.println("El motor diesel se enciende");
    }

    @Override
    public void Operar() {
        System.out.println("El motor diesel opera");
    }

    @Override
    public void Apagar() {
        System.out.println("El motor diesel se apaga");
    }

}
