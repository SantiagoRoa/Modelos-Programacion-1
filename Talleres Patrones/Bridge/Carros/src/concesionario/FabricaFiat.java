/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import carro.Camioneta;
import color.Color;
import carro.Coupe;
import carro.Focus;
import carro.Palio;
import carro.Sedan;
import carro.Siena;
import carro.Strada;

/**
 *
 * @author jgale
 */
public class FabricaFiat extends FabricaModelos{

    @Override
    public Sedan crearSedan(Color color) {
        return new Siena(color);
    }

    @Override
    public Coupe crearCoupe(Color color) {
        return new Palio(color);
    }

    @Override
    public Camioneta crearCamioneta(Color color) {
        return new Strada(color);
    }
    
}
