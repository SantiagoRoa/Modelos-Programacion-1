/*
 * Autor: Nelson Santiago Roa Garzón
 * 15/02/2020 10:25:05 PM
 */
package Controlador;

public class MotorGasolina extends Motor {

    @Override
    public void Encender() {
        System.out.println("El motor de gasolina se enciende");
    }

    @Override
    public void Operar() {
        System.out.println("El motor de gasolina opera");
    }

    @Override
    public void Apagar() {
        System.out.println("El motor de gasolina se apaga");
    }

}
