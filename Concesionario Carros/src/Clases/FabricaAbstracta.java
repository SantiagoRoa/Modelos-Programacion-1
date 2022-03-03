/**
 * 4/05/2019 05:33:34 PM
 * Autor: Santiago Roa
 */
package Clases;

import Carros.Camioneta;
import Carros.Carro;
import Carros.Color;
import Carros.Coupe;
import Carros.Sedan;

public class FabricaAbstracta {

    public Carro crearCarro(String marca, String tipo, String color) {

        FabricaCarro fabrica;
        Sedan sedan;
        Coupe coupe;
        Camioneta camioneta;

        switch (marca) {
            case "Acura":
                fabrica = new FabricaAcura();
                break;
            case "Porsche":
                fabrica = new FabricaPorsche();
                break;
            case "Rolls Royce":
                fabrica = new FabricaRR();
                break;
            default:
                fabrica = null;
        }

        sedan = fabrica.crearSedan(color);
        coupe = fabrica.crearCoupe(color);
        camioneta = fabrica.crearCamioneta(color);

        switch (tipo) {
            case "Sedan":
                return sedan;
            case "Coupe":
                return coupe;
            case "Camioneta":
                return camioneta;
            default:
                return null;
        }
        
        
    }
}
