/*
 * Universidad Distrital Francisco José de Caldas
 * Ingeniería de Sistemas
 * Autor: Nelson Santiago Roa Garzón
 * 16/02/2020 05:39:03 PM
 */
package Controlador;

import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Material material;
        System.out.println("Seleccione la opción deseada \n1.Oro \n2.Mercurio");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                material = new OroProxy();
                material.mostrar();
                material.cargarse();
                material.purificarse();
                material.descargarse();
                break;
            case 2:
                material = new MercurioAdapter();
                material.mostrar();
                material.cargarse();
                material.purificarse();
                material.descargarse();
                break;
        }
    }

}
