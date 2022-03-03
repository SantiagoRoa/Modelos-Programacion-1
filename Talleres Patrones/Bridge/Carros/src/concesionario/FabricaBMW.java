/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import carro.Camioneta;
import color.Color;
import carro.Coupe;
import carro.Sedan;
import carro.Serie5;
import carro.X5;
import carro.Z4;

/**
 *
 * @author jgale
 */
public class FabricaBMW extends FabricaModelos{

    @Override
    public Sedan crearSedan(Color color) {
        return new Serie5(color);
    }

    @Override
    public Coupe crearCoupe(Color color) {
        return new Z4(color);
    }

    @Override
    public Camioneta crearCamioneta(Color color) {
        return new X5(color);
    }
    
}
