/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 31/08/2019 07:28:21 PM
 */
package Controlador;

import Fabricas.AbstractFactory;
import Equipamiento.Arma;
import Equipamiento.Armadura;
import Fabricas.FabricaArquero;
import Fabricas.FabricaGuerrero;
import Fabricas.FabricaMago;
import Personajes.Heroe;
import java.util.Scanner;

public class Control {

    public void mostrar(int opcion) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AbstractFactory fabrica = null;
        Arma arma;
        Armadura armadura;
        Heroe heroe;
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nIngrese una opción: \n1.Guerrero \n2.Arquero \n3.Mago \n4.Salir \n");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    fabrica = new FabricaGuerrero();
                    break;
                case 2:
                    fabrica = new FabricaArquero();
                    break;
                case 3:
                    fabrica = new FabricaMago();
                    break;
                case 4:
                    System.exit(0);
            }
            arma = fabrica.crearArma();
            armadura = fabrica.crearArmadura();
            heroe = fabrica.crearHeroe();
            System.out.println("\n-Heroe: " + heroe.getNombre() + "\nHP: " + heroe.getHp() + "\nMP: " + heroe.getMp());
            System.out.println("-Arma: " + arma.getNombre() + "\nDaño Físico: " + arma.getDañoFisico() + "\nDaño Mágico: " + arma.getDañoMagico());
            System.out.println("-Armadura: " + armadura.getNombre() + "\nDefensa Física: " + armadura.getDefensaFisica() + "\nDefensa Mágica:" + armadura.getDefensaMagica() + "\n");
        }

    }
}
