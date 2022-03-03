/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

/**
 *
 * @author jgale
 */
public class Color {
    
    protected String color;
    protected Textura textura;
    
    public Color() {
        
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }

    public void setTextura(Textura textura) {
        this.textura = textura;
    }

    public Textura getTextura() {
        return textura;
    }
}
