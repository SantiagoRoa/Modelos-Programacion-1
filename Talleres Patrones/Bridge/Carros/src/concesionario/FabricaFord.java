/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import carro.Camioneta;
import color.Color;
import carro.Coupe;
import carro.Ecosport;
import carro.Fiesta;
import carro.Focus;
import carro.Sedan;

/**
 *
 * @author jgale
 */
public class FabricaFord extends FabricaModelos{

    @Override
    public Sedan crearSedan(Color color) {
        return new Focus(color);
    }

    @Override
    public Coupe crearCoupe(Color color) {
        return new Fiesta(color);
    }

    @Override
    public Camioneta crearCamioneta(Color color) {
        return new Ecosport(color);
    }
    
}
