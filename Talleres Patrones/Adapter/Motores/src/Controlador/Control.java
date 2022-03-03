/*
 * Universidad Distrital Francisco José de Caldas
 * Ingeniería de Sistemas
 * Autor: Nelson Santiago Roa Garzón
 * 15/02/2020 10:22:14 PM
 */
package Controlador;

import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Motor motor;
        int opcion = 0;
        System.out.println("Seleccione la opción deseada:");
        System.out.println("1. Motor de Gasolina \n2. Motor Diesel \n3. Motor Eléctrico");
        opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                motor = new MotorGasolina();
                System.out.println("Motor de Gasolina");
                motor.Encender();
                motor.Operar();
                motor.Apagar();
                break;
            case 2:
                motor = new MotorDiesel();
                System.out.println("Motor Diesel");
                motor.Encender();
                motor.Operar();
                motor.Apagar();
                break;
            case 3:
                System.out.println("Motor Eléctrico");
                motor = new MotorElectricoAdapter();
                motor.Encender();
                motor.Operar();
                motor.Apagar();
                break;
        }
    }

}
