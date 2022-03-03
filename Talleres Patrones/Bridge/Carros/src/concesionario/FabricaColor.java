/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import color.Azul;
import color.Color;
import color.Rojo;
import color.Textura;
import color.Verde;

/**
 *
 * @author jgale
 */
public class FabricaColor {
        
    public Color getFabricaColor(String color, Textura textura)
    {
        if(color.equals("Rojo"))
        {
            Color col = new Rojo(textura);
            return col;
        }
        if(color.equals("Azul"))
        {
            Color col = new Azul(textura);
            return col;
        }
        if(color.equals("Verde"))
        {
            Color col = new Verde(textura);
            return col;
        }
        else
        {
            return null;
        }
    }
}
